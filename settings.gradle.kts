pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://jitpack.io")
    }
}

rootProject.name = "ForkTest"

include("ForkTest-API", "ForkTest-Server", "ForkTest-MojangAPI")
