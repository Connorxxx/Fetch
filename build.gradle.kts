buildscript {
//    extra.apply {
//        set("compose_version", "1.3.2")
//    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.3.0" apply false
    id("com.android.library") version "7.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}
task("clean", type = Delete::class) {
    delete(rootProject.buildDir)
}

task("hello") {
    doLast {
        println("Hello world!")
    }
}