apply {
    plugin("kotlin")
}

buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", Versions.kotlinVersion))
    }
}

dependencies {
    implementation(gradleKotlinDsl())
    implementation(Dependencies.kotlinStdlib)
}

repositories {
    gradlePluginPortal()
}