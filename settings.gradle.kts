pluginManagement {
    val kotlinVersion: String by settings

    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    plugins {
        kotlin("multiplatform") version kotlinVersion apply false
    }
}


plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}


rootProject.name = "CoroutineExtensions"


include("coroutine-extensions")
