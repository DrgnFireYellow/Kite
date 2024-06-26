plugins {
    id("java")
    id("maven-publish")
}

group = "com.github.DrgnFireYellow"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    implementation("com.github.DrgnFireYellow:kite:master-SNAPSHOT")
}

publishing {
    publications {
        // Creates a Maven publication called "release".
        register("release", MavenPublication::class) {
            groupId = "com.drgnfireyellow"
            artifactId = "kite"
            version = "1.0.0"
        }
    }
}