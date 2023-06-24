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
//    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.354"))
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom")

//    val reactVersion = "18.2.0-pre.549"
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:$reactVersion")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:$reactVersion")
//    val reactRouterDomVersion = "6.11.1-pre.549"
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:$reactRouterDomVersion")
//    val emotionVersion = "11.11.0-pre.549"
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:$emotionVersion")


    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.0-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router:6.11.2-pre.557")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.11.2-pre.557")

//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.290-kotlin-1.6.10")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.290-kotlin-1.6.10")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-redux:4.1.2-pre.290-kotlin-1.6.10")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:7.2.6-pre.290-kotlin-1.6.10")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.3-pre.290-kotlin-1.6.10")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.2.1-pre.290-kotlin-1.6.10")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-ring-ui:4.1.5-pre.290-kotlin-1.6.10")

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