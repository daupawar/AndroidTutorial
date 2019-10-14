/**
 * ༼-つ-◕_◕-༽つ
 * @author Rohan on 2019-10-13.
 */


object Versions {
    const val buildToolsVersion = "3.3.1"
    const val kotlinVersion = "1.3.21"
    const val jetpack = "1.0.0-beta01"
    const val constraintLayout = "1.1.2"
    const val ktx = "1.1.0-alpha05"
    const val junit4 = "4.12"
    const val testRunner = "1.1.0-alpha4"
    const val espresso = "3.1.0-alpha4"
    const val min = 15
    const val compile = 28
    const val playLocation = "17.0.0"
    const val retrofit = "2.5.0"
    const val lifecycle = "2.1.0"
    const val coil = "0.7.0"
    const val rxKotlinVersion = "2.3.0"
    const val rxAndroidVersion = "2.1.0"
    const val gsonVersion = "2.8.1"
    const val firebase = "17.3.4"
    const val koinVersion = "2.0.0-beta-1"
    const val workManager = "1.0.0-alpha05"
    const val snapHelper="1.5"

    const val BASE_URL_DEV = "https://dev.com/"
    const val AWS_BUCKET_DEV = "development"

    const val BASE_URL_STAG = "https://stag.com/"
    const val AWS_BUCKET_STAG = "staging"

    const val BASE_URL_PROD = "https://prod.com/"
    const val AWS_BUCKET_PROD = "production"
}


object Dependencies {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
}

object AndroidSdk {
    const val minSDK = Versions.min
    const val compileSDK = Versions.compile
    const val targetSDK = compileSDK
}

object Libraries {
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"

    const val playLocationService =
        "com.google.android.gms:play-services-location:${Versions.playLocation}"

    const val playMaps="com.google.android.gms:play-services-maps:${Versions.playLocation}"

    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

    const val archRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"

    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlinVersion}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"
    const val koin = "org.koin:koin-android:${Versions.koinVersion}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koinVersion}"
    const val koinScope = "org.koin:koin-androidx-scope:${Versions.koinVersion}"

    const val snapHelper= "com.github.rubensousa:gravitysnaphelper:${Versions.snapHelper}"
    const val coil= "io.coil-kt:coil:${Versions.snapHelper}"
}

object TestLibraries {
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
