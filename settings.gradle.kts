rootProject.name = "gradle-commnos"

dependencyResolutionManagement {
    versionCatalogs {
        create("testExternal") {
            version("junit", "5.10.0")
            library("junit-bom", "org.junit", "junit-bom").versionRef("junit")
            library("junit-jupiter", "org.junit.jupiter", "junit-jupiter").withoutVersion()
        }
    }
}

include("datastore")
include("templates")
