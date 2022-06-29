package project.jh.snslogin.buildsrc

import org.gradle.api.Project
import java.io.FileInputStream
import java.util.*

fun Project.buildVersionCode(): Int {
    val props = Properties()
    props.load(FileInputStream(file("version.properties")))

    val major = props.getProperty("VERSION_MAJOR").toInt()
    val minor = props.getProperty("VERSION_MINOR").toInt()
    val patch = props.getProperty("VERSION_PATCH").toInt()
    val qa = props.getProperty("VERSION_QA").toInt()

    val versionCode = (major * 100_000_000) + (minor * 1_000_000) + (patch * 10_000) + (qa * 100)

    println("versionCode = $versionCode")

    return versionCode
}

fun Project.buildVersionName(): String {
    val props = Properties()
    props.load(FileInputStream(file("version.properties")))

    val versionName = "${props.getProperty("VERSION_MAJOR").toInt()}.${props.getProperty("VERSION_MINOR").toInt()}.${props.getProperty("VERSION_PATCH").toInt()}.${props.getProperty("VERSION_QA").toInt()}.${buildNumber()}"

    println("versionName = $versionName")

    return versionName
}

private fun buildNumber(): Int {
    val buildNumber = System.getenv("BITRISE_BUILD_NUMBER")?.toInt() ?: 0

    if(buildNumber > 9999) {
        throw IllegalArgumentException("build number must not be greater than 9999")
    }

    return buildNumber
}