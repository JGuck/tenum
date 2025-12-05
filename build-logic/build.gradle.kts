plugins {
    `kotlin-dsl`
    alias(libs.plugins.ktlint)
    alias(libs.plugins.maven.publication)
    alias(libs.plugins.changelog)
}

group = "ai.plantitude.conventions"

repositories {
    mavenCentral()
    gradlePluginPortal() // so that external plugins can be resolved in dependencies section
}

dependencies {
    implementation(libs.bundles.convention.dependencies)
    testImplementation(libs.bundles.convention.test.dependencies)
}

ktlint {
    filter {
        exclude { entry ->
            entry.file.toString().contains("generated")
        }
    }
}
