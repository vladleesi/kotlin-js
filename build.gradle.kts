plugins {
    kotlin("multiplatform") version "2.0.20"
}

group = "dev.vladleesi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(libs.kotlin.wrappers.react)
                implementation(libs.kotlin.wrappers.react.dom)
                implementation(libs.kotlin.wrappers.react.router)
                implementation(libs.kotlin.wrappers.react.router.dom)
                implementation(libs.kotlin.wrappers.emotion)
                implementation(libs.kotlin.wrappers.css)
            }
        }
    }
}