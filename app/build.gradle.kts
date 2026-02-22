plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.smartmart"
    compileSdk = 36
    defaultConfig {
        applicationId = "com.example.smartmart"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.retrofit)
    implementation(libs.retrofit2.converter.gson)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Hilt
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-android-compiler:2.50")

// Hilt Navigation (for fragments)
    implementation("androidx.hilt:hilt-navigation-fragment:1.1.0")

// If using Jetpack Compose navigation
    implementation("androidx.hilt:hilt-navigation-compose:1.1.0")
}
