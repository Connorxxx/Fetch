pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven ("https://jitpack.io")
    }
}
rootProject.name = "Fetch"
include(":app")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            val compose = "1.3.2"
            val material3 = "1.1.0-alpha03"
            val core = "1.9.0"
            val lifecycle = "2.5.1"
            val activity = "1.6.1"
            val coroutine = "1.6.3"
            val room = "2.4.3"
            val hilt = "2.44"
            val pager = "0.28.0"
            val youtubedl = "a5c7ff837f"

            library("androidx-core", "androidx.core:core-ktx:$core")
            library("androidx-lifecycle-runtime","androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle")
            library("androidx-lifecycle-viewmodel-compose", "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle")
            library("androidx-activity-compose","androidx.activity:activity-compose:$activity")
            library("androidx-compose-ui", "androidx.compose.ui:ui:$compose")
            library("androidx-compose-preview", "androidx.compose.ui:ui-tooling-preview:$compose")
            library("androidx-compose-material3", "androidx.compose.material3:material3:$material3")
            library("kotlin-coroutine-core", "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine")
            library("kotlin-coroutine-android", "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine")
            library("androidx-room-runtime", "androidx.room:room-runtime:$room")
            library("androidx-room-ktx", "androidx.room:room-ktx:$room")
            library("androidx-room-compiler", "androidx.room:room-compiler:$room")
            library("google-hilt", "com.google.dagger:hilt-android:$hilt")
            library("google-hilt-compiler", "com.google.dagger:hilt-android-compiler:$hilt")
            library("google-accompanist-pager", "com.google.accompanist:accompanist-pager:$pager")
            library("youtube-dl", "com.github.yausername.youtubedl-android:library:$youtubedl")
        }
    }
}
