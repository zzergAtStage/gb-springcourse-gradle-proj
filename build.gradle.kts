plugins {
    id("java")
    id("io.freefair.lombok") version "8.4"
}

group = "com.zergatstage.gradletst"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.google.guava:guava:30.1-jre")
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<Jar>("jar") {
    archiveFileName.set("gb-grdl-tst.1.0-SNAPSHOT.jar")
}