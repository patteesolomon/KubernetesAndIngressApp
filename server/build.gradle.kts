plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    application
}

group = "org.example.project"
version = "1.0.0"
application {
    mainClass.set("org.example.project.ApplicationKt")
    
    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}
var kotlin_version = "3.1.3"
dependencies {
    implementation(projects.shared)
    implementation(libs.logback)
    implementation("io.ktor:ktor-server-core:3.1.2")
    implementation("org.mongodb:bson-kotlinx")
    implementation("io.ktor:ktor-server-netty:3.1.2")
    implementation("org.mongodb:mongodb-driver-sync:4.4.3")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("org.mongodb:mongodb-driver-kotlin-coroutine")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${kotlin_version}")
    implementation(libs.identity.jvm)
    testImplementation(libs.ktor.serverTestHost)
    testImplementation(libs.kotlin.testJunit)
}