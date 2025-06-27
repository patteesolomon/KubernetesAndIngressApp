// replace your gradle deps with these in your 
// server build.gradle.kts at the root of the project folder
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
