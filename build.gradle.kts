plugins {
    kotlin("js") version "1.9.23"
}

group = "dev.vladleesi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.wrappers.react)
    implementation(libs.kotlin.wrappers.react.dom)
    implementation(libs.kotlin.wrappers.react.router)
    implementation(libs.kotlin.wrappers.react.router.dom)
    implementation(libs.kotlin.wrappers.emotion)
    implementation(libs.kotlin.wrappers.css)

    // Test
    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
}