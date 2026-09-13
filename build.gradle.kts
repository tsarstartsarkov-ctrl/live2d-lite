plugins {
    id("com.android.application")
}

android {
    namespace = "ru.live2dlite"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.live2dlite"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {}
