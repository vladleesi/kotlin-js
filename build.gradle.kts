plugins {
    kotlin("js") version "1.9.23"
}

group = "dev.vladleesi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // React, React DOM + Wrappers
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.722")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.722")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.4-pre.722")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router:6.22.1-pre.722")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.22.1-pre.722")

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