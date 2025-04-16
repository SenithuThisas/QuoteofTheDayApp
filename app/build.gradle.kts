plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.quoteoftheday"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.quoteoftheday"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true  // Changed to true for release optimization
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    // Step 2: Enable View Binding
    buildFeatures {
        viewBinding = true
    }

    // Optional: Enable data binding if needed later
    // buildFeatures {
    //     dataBinding = true
    // }

    //change1
    //change2
    //change3
    //fix the email issues.git status
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Optional: Add these if you want smoother animations
    // implementation("androidx.core:core-ktx:1.12.0")
    // implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
}