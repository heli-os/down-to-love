plugins {
    kotlin("plugin.allopen")
    kotlin("plugin.noarg")
    kotlin("plugin.jpa")
}

noArg {
    annotations(
        "jakarta.persistence.Entity",
        "jakarta.persistence.MappedSuperclass",
        "jakarta.persistence.Embeddable"
    )
}

allOpen {
    annotations(
        "jakarta.persistence.Entity",
        "jakarta.persistence.MappedSuperclass",
        "jakarta.persistence.Embeddable"
    )
}

dependencies {
    implementation(project(":application-core"))
}
