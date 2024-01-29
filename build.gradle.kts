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
// https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.8.9")


}

tasks.test {
    useJUnitPlatform()
    include("com.zergatstage.grdltst.AppTest")
    include("com.zergatstage.grdltst.PersonTest")
}

tasks.named<Jar>("jar") {
    archiveFileName.set("gb-grdl-tst.1.0-SNAPSHOT.jar")
}