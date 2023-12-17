// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

    id("org.sonarqube") version "4.4.1.3373"
}

sonar {
    properties {
        property("sonar.projectKey", "pepper11com_bookish-octo-fiesta_AYx4drJ-z3Klx-XHyUzv")
        property("sonar.projectName", "bookish-octo-fiesta")
    }
}