rootProject.name = "build-logic"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            // Reuse the root project's version catalog for plugins and dependencies
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
