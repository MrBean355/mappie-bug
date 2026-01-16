import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.devtools.ksp)

    // Working version:
    // id("tech.mappie.plugin") version "2.2.21-1.6.1"

    // Problematic version:
    id("tech.mappie.plugin") version "2.2.21-2.0.0"
}

android {
    namespace = "com.github.mrbean355.mappiebug"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }
    defaultConfig {
        applicationId = "com.github.mrbean355.mappiebug"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_11)
    }
}

dependencies {
    implementation(libs.material)

    // Working version:
    // implementation("tech.mappie:mappie-api:2.2.21-1.6.1")

    // Problematic version:
    implementation("tech.mappie:mappie-api:2.2.21-2.0.0")
}
