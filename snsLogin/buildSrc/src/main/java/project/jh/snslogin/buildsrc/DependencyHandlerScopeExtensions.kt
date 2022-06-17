import org.gradle.kotlin.dsl.DependencyHandlerScope
import project.jh.snslogin.buildsrc.Libs

/**
 * Created by jihye
 * Date: 2022/05/29
 */

fun DependencyHandlerScope.implementCompose() {
    "implementation"(Libs.AndroidX.Compose.ui)
}