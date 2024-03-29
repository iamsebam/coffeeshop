plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(Versions.compileSdk)

    defaultConfig {
        minSdkVersion(Versions.minimumSdk)
        targetSdkVersion(Versions.targetSdk)
    }

    buildTypes {
        getByName("debug")
        getByName("release")
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

    implementation(Libs.composeUI)
    implementation(Libs.composeMaterial)
    implementation(Libs.composeUiTooling)

}