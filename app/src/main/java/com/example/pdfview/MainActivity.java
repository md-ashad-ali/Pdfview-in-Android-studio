package com.example.pdfview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;
    LottieAnimationView lottieAnimationView;

    public static  String pdfurl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);
        lottieAnimationView = findViewById(R.id.animationView);



        pdfView.fromAsset(pdfurl)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {

                        pdfView.setVisibility(View.VISIBLE);
                        lottieAnimationView.setVisibility(View.GONE);



                    }
                })
                .load();


    }

    public  void massage(String massage)
    {
        Toast.makeText(this, ""+massage, Toast.LENGTH_SHORT).show();

    }


}