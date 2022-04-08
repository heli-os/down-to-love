pluginManagement {
	repositories {
		maven { url = uri("https://repo.spring.io/milestone") }
		maven { url = uri("https://repo.spring.io/snapshot") }
		gradlePluginPortal()
	}
}
rootProject.name = "down-to-love-backend"

include("application-webapp")
include("application-usecase")
include("application-data")
include("application-core")
