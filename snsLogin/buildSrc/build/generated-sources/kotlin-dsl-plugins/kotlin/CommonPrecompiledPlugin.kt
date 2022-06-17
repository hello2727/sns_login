/**
 * Precompiled [common-precompiled.gradle.kts][Common_precompiled_gradle] script plugin.
 *
 * @see Common_precompiled_gradle
 */
class CommonPrecompiledPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Common_precompiled_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
