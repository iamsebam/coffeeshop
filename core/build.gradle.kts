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

    kotlinOptions {
        useIR = true
    }
}

dependencies {

    implementation(project(Module.Feature.landing))

    implementation(Libs.koin)
}

