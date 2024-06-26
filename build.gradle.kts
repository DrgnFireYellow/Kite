plugins {
    id("java")
    id("maven-publish")
}

group = "com.drgnfireyellow"
version = "1.0-SNAPSHOT"

project.extra.set("artifactId", "kite")

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}

publishing {
     repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/DrgnFireYellow/Kite") // Github Package
            credentials {
                 //Fetch these details from the properties file or from Environment variables
                username = System.getenv("GPR_USER")
                password = System.getenv("GPR_API_KEY")
            }
        }
    }
}
