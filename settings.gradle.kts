pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()


        maven{ setUrl( "https://jcenter.bintray.com" ) }


    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven{ setUrl( "https://jcenter.bintray.com" ) }

    }
}

rootProject.name = "pdfView"
include(":app")
