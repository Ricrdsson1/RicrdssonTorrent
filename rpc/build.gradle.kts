import org.equeim.tremotesf.gradle.Versions

plugins {
    id("org.equeim.tremotesf")
    id("com.android.library")
    kotlin("android")
    kotlin("plugin.parcelize")
    kotlin("plugin.serialization")
}


android {
    compileSdk = Versions.compileSdk
    ndkVersion = Versions.ndk

    defaultConfig {
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        consumerProguardFile("consumer-rules.pro")
    }
    
    sourceSets.named("main") {
        java.srcDirs("src/main/kotlin")
    }
    
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    flavorDimensions("freedom")
    productFlavors {
        register("google") {
            dimension = "freedom"
            buildConfigField("boolean", "GOOGLE", "true")
        }
        register("fdroid") {
            dimension = "freedom"
            buildConfigField("boolean", "GOOGLE", "false")
        }
    }
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(project(":common"))
    api(project(":libtremotesf"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinxSerialization}")

    implementation("androidx.concurrent:concurrent-futures:${Versions.AndroidX.concurrentFutures}")
    implementation("androidx.core:core-ktx:${Versions.AndroidX.core}")
    implementation("androidx.work:work-runtime:${Versions.AndroidX.work}")

    implementation("com.jakewharton.timber:timber:${Versions.timber}")
}