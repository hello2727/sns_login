package project.jh.snslogin.buildsrc

/**
 * Created by jihye
 * Date: 2022/05/29
 */
object Libs {
    const val Lottie = "com.airbnb.android:lottie:5.2.0"
    const val coil = "io.coil-kt:coil:2.1.0"

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.6.10"
    }

    object Google {
        const val material = "com.google.android.material:material:1.6.1"
        const val accompanist = "com.google.accompanist:accompanist-appcompat-theme:0.23.1"

        object Hilt {
            const val plugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

            const val android = "com.google.dagger:hilt-android:${Versions.hilt}"
            const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
            const val navigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"

            object Test {
                const val testing = "com.google.dagger:hilt-android-testing:${Versions.hilt}"
            }
        }
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.8.0"
        const val appcompat = "androidx.appcompat:appcompat:1.4.2"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:2.4.2"
        const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:2.4.2"
        const val startupRuntime = "androidx.startup:startup-runtime:1.1.1"
        const val work = "androidx.work:work-runtime-ktx:${Versions.work}"
        const val workGcm = "androidx.work:work-gcm:${Versions.work}"
        const val benchmark = "androidx.benchmark:benchmark-junit4:1.1.0"
        const val profileInstaller = "androidx.profileinstaller:profileinstaller:1.1.0"
        const val junitRunner = "androidx.test.runner.AndroidJUnitRunner"

        object Compose {
            const val ui = "androidx.compose.ui:ui:${Versions.compose}"
            const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
            const val animation = "androidx.compose.animation:animation:${Versions.compose}"
            const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
            const val material = "androidx.compose.material:material:${Versions.compose}"
            const val materialIconsCore = "androidx.compose.material:material-icons-core:${Versions.compose}"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
            const val lifecycleViewmodelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
            const val runtimeRxjava2 = "androidx.compose.runtime:runtime-rxjava2:${Versions.compose}"

            object Test {
                const val ui = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
            }
        }

        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.room}"
            const val ktx = "androidx.room:room-ktx:${Versions.room}"

            const val test = "androidx.room:room-testing:${Versions.room}"
        }

        object Test {
            const val junit = "androidx.test.ext:junit:1.1.3"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
        }
    }

    object Network {

    }

    object Firebase {
        const val bom = "com.google.firebase:firebase-bom:30.2.0"
        const val auth = "com.google.firebase:firebase-auth"
        const val playServiceAuth = "com.google.android.gms:play-services-auth:20.2.0"
    }

    object Auth {
        const val naver = "com.navercorp.nid:oauth:5.1.1"
        const val facebook = "com.facebook.android:facebook-login:latest.release"
        const val kakao = "com.kakao.sdk:v2-all:2.11.0"
        const val spotify = "com.spotify.android:auth:1.2.5"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
    }
}