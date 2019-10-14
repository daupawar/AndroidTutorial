plugins {
    id(Dependencies.androidApplication)
    id(Dependencies.kotlinAndroid)
    id(Dependencies.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(AndroidSdk.compileSDK)
    defaultConfig {
        applicationId = "com.oops.asr"
        minSdkVersion(AndroidSdk.minSDK)
        targetSdkVersion(AndroidSdk.targetSDK)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)

    testImplementation (TestLibraries.junit4)
    androidTestImplementation (TestLibraries.testRunner)
    androidTestImplementation (TestLibraries.espresso)

    implementation(Libraries.playLocationService)
    implementation(Libraries.playMaps)
    implementation(Libraries.gson)
    implementation(Libraries.retrofit)
    implementation(Libraries.retrofitGsonConverter)
    implementation(Libraries.retrofitAdapter)
    implementation(Libraries.archRuntime)
    implementation(Libraries.rxkotlin)
    implementation(Libraries.rxAndroid)
    implementation(Libraries.koin)
    implementation(Libraries.koinViewModel)
    implementation(Libraries.koinScope)
}
