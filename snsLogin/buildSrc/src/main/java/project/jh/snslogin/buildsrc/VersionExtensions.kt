import org.gradle.api.Project

fun Project.buildVersionCode(): Int {
    val  s = file("version.properties")
    return 0
}

fun Project.buildVersionName(): String {
    return ""
}

private fun buildNumber(): Int {
    val buildNumber = System.getenv("BITRISE_BUILD_NUMBER")?.toInt() ?: 0

    if(buildNumber > 9999) {
        throw IllegalArgumentException("build number must not be greater than 9999")
    }

    return buildNumber
}