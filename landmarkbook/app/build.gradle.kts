plugins {
    alias(libs.plugins.android.application)


}

android {
    namespace = "com.example.landmarkbook"
    compileSdk = 35


    defaultConfig {
        applicationId = "com.example.landmarkbook"
        minSdk =24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8 // Java 1.8 ayarı
    }




    buildFeatures {
        viewBinding=  true
    }
}

dependencies {




    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.runtime.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


}