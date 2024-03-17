plugins { id("java") }

subprojects {
    apply(plugin = "java")

    group = "com.tanayhub.commons"
    version = "0.0.0"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        testImplementation(platform(rootProject.testExternal.junit.bom))
        testImplementation(rootProject.testExternal.junit.jupiter)
    }

    tasks.test {
        useJUnitPlatform()
    }
}