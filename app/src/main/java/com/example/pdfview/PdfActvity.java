package com.example.pdfview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PdfActvity extends AppCompatActivity {

    Button pdfone,pdftwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_actvity);

        Id_find();
        On_create_Mathod();

        MainActivity.pdfurl ="AndroidNotesForProfessionals.pdf";


    }

    private void On_create_Mathod() {

        pdfone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.pdfurl ="AndroidNotesForProfessionals.pdf";
                Intent  intent = new Intent(PdfActvity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        pdftwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.pdfurl ="ashad.pdf";
                Intent  intent = new Intent(PdfActvity.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }

    private void Id_find() {

        pdfone = findViewById(R.id.pdfone);
        pdftwo = findViewById(R.id.pdftwo);

    }
}