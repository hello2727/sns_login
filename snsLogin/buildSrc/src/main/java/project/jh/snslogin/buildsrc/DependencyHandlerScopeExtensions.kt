import org.gradle.kotlin.dsl.DependencyHandlerScope
import project.jh.snslogin.buildsrc.Libs

/**
 * Created by jihye
 * Date: 2022/06/18
 */
fun DependencyHandlerScope.implementKotlin() {
    "implementation"(Libs.Kotlin.stdlib)
}

fun DependencyHandlerScope.implementAndroidX() {
    "implementation"(Libs.AndroidX.coreKtx)
    "implementation"(Libs.AndroidX.appcompat)
    "implementation"(Libs.AndroidX.constraintlayout)
    "implementation"(Libs.AndroidX.navigationFragmentKtx)
    "implementation"(Libs.AndroidX.navigationUiKtx)
}

fun DependencyHandlerScope.implementGoogle() {
    "implementation"(Libs.Google.material)
}

fun DependencyHandlerScope.implementCompose() {
    "implementation"(Libs.AndroidX.Compose.ui)
    "implementation"(Libs.AndroidX.Compose.uiTooling)
    "implementation"(Libs.AndroidX.Compose.animation)
    "implementation"(Libs.AndroidX.Compose.foundation)
    "implementation"(Libs.AndroidX.Compose.material)
    "implementation"(Libs.AndroidX.Compose.materialIconsCore)
    "implementation"(Libs.AndroidX.Compose.materialIconsExtended)
    "implementation"(Libs.AndroidX.Compose.activityCompose)
    "implementation"(Libs.AndroidX.Compose.lifecycleViewmodelCompose)
    "implementation"(Libs.AndroidX.Compose.runtimeLivedata)
    "implementation"(Libs.AndroidX.Compose.runtimeRxjava2)
}

fun DependencyHandlerScope.implementDi() {
    "implementation"(Libs.Google.Hilt.android)
    "kapt"(Libs.Google.Hilt.compiler)
}

fun DependencyHandlerScope.implementRoom() {
    "implementation"(Libs.AndroidX.Room.runtime)
    "kapt"(Libs.AndroidX.Room.compiler)
    "implementation"(Libs.AndroidX.Room.ktx)
    "implementation"(Libs.AndroidX.Room.test)
}

fun DependencyHandlerScope.implementTest() {
    "testImplementation"(Libs.Test.junit)
    "androidTestImplementation"(Libs.AndroidX.Test.junit)
    "androidTestImplementation"(Libs.AndroidX.Test.espressoCore)
}