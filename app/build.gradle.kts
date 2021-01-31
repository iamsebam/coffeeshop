plugins {
    id("com.android.application")
    kotlin("android")
    id("com.google.gms.google-services")
}

android {
    compileSdkVersion(Versions.compileSdk)

    defaultConfig {
        applicationId = "com.sebastianmatyjaszczyk.coffeeshop"
        minSdkVersion(Versions.minimumSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Versions.javaVersion
        targetCompatibility = Versions.javaVersion
    }
    kotlinOptions {
        jvmTarget = Versions.jvmTarget
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
}

dependencies {
    implementation(platform(Libs.firebaseBom))

    implementation(Libs.androidCoreKtx)
    implementation(Libs.androidAppCompact)
    implementation(Libs.androidMaterial)
    implementation(Libs.androidLifecycleRuntimeKtx)

    implementation(Libs.composeUI)
    implementation(Libs.composeMaterial)
    implementation(Libs.composeUiTooling)

    implementation(Libs.firebaseAnalyticsKts)

    testImplementation(Libs.junit)
    androidTestImplementation(Libs.androidTestJunit)
    androidTestImplementation(Libs.espressoCore)
}