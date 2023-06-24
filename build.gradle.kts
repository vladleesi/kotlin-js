plugins {
    kotlin("js") version "1.8.21"
}

group = "io.github.vladleesi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // React, React DOM + Wrappers
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.0-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router:6.11.2-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.11.2-pre.557")

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