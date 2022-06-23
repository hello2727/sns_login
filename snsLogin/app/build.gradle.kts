import project.jh.snslogin.buildsrc.Libs

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
//    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.targetSdk

    defaultConfig {
        applicationId = "project.jh.snslogin"
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = Libs.AndroidX.junitRunner
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Versions.jvmTarget
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementAndroidX()
    implementGoogle()
    implementCompose()
    implementDi()
    implementRoom()
    implementTest()
}