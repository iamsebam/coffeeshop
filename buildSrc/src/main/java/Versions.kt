import org.gradle.api.JavaVersion

object Versions {

    const val versionName = "1.0"
    const val versionCode = 1

    const val minimumSdk = 27
    const val targetSdk = 30
    const val compileSdk = 30

    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"

    const val androidCoreKtx = "1.3.2"
    const val androidAppCompact = "1.2.0"
    const val androidMaterial = "1.2.1"
    const val androidLifecycleRuntimeKtx = "2.3.0-alpha06"

    const val compose = "1.0.0-alpha11"

    const val firebaseBom = "26.4.0"

    const val junit = "4.17.0"
    const val androidTestJunit = "1.1.2"
    const val espressoCore = "3.3.0"

    const val gradleBuildTools = "7.0.0-alpha05"
    const val gradlePlugin = "1.4.21-2"
    const val googleServices = "4.3.5"
}