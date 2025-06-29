// replace your gradle deps with these in your 
// server build.gradle.kts at the root of the project folder
dependencies {
    implementation(projects.shared)
    implementation(libs.logback)
    implementation(libs.ktor.serverCore)
    implementation(libs.ktor.serverNetty)
    testImplementation(libs.ktor.serverTestHost)
    testImplementation(libs.kotlin.testJunit)
    implementation(projects.shared)
    implementation(libs.logback)
    implementation("io.ktor:ktor-server-core:3.1.2")
    implementation("io.ktor:ktor-server-netty:3.1.2")
    implementation("org.mongodb:mongodb-driver-sync:4.4.3")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("org.mongodb:mongodb-driver-sync:5.5.1")
    testImplementation(libs.ktor.serverTestHost)
    testImplementation(libs.kotlin.testJunit)
}
