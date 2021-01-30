plugins {
    id("com.android.application")
    kotlin("android")
    id("com.google.gms.google-services")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "com.sebastianmatyjaszczyk.coffeeshop"
        minSdkVersion(27)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-alpha08"
        kotlinCompilerVersion = "1.4.21"
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:26.4.0"))

    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.compose.ui:ui:1.0.0-alpha08")
    implementation("androidx.compose.material:material:1.0.0-alpha08")
    implementation("androidx.compose.ui:ui-tooling:1.0.0-alpha08")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-alpha06")
    implementation("com.google.firebase:firebase-analytics-ktx")


    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}