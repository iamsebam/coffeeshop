import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.project

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

    implementation(project(Module.Lib.composeBase))

    implementation(Libs.koin)
    implementation(Libs.koinViewModel)

    implementation(Libs.composeUI)
    implementation(Libs.composeMaterial)
    implementation(Libs.composeUiTooling)

    implementation(Libs.androidCoreKtx)
    implementation(Libs.androidAppCompact)
    implementation(Libs.androidMaterial)
    implementation(Libs.androidLifecycleRuntimeKtx)
}