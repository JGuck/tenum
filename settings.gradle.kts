rootProject.name = "tenum"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

include(
    ":cli",
    ":clinpm",
)
