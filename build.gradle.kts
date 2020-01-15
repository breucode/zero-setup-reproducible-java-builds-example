plugins {
    java
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("org.hamcrest:hamcrest:2.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

tasks.withType<Test> {
    useJUnitPlatform()
}