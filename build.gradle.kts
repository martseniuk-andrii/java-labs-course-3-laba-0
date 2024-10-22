plugins {
    id("java")
}

group = "lol.kek"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.10.2")
}

tasks.test {
    useTestNG()
}