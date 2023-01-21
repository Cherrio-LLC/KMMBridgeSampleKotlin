plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("co.touchlab.faktory.kmmbridge") version "0.3.4"
    `maven-publish`
    kotlin("native.cocoapods")
}

version = "0.1"
kotlin {
    android()
    ios()
    // Note: iosSimulatorArm64 target requires that all dependencies have M1 support
    iosSimulatorArm64()
    cocoapods {
        summary = "KMMBridgeSampleKotlin"
        homepage = "https://github.com/Cherrio-LLC/RealTime"
        ios.deploymentTarget = "13"
    }
}

android {
    compileSdk = 33
    namespace = "com.cherrio.realtime"
    defaultConfig {
        minSdk = 25
    }
}

addGithubPackagesRepository()
kmmbridge {
    mavenPublishArtifacts()
    githubReleaseVersions()
    spm()
    cocoapods("git@github.com:Cherrio-LLC/RealTimePodspec.git")
    versionPrefix.set("0.1")
}