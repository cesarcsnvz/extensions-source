plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "eu.kanade.tachiyomi.extension.es.shadowmanga"

    defaultConfig {
        applicationId = "eu.kanade.tachiyomi.extension.es.shadowmanga"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(project(":lib-multisrc:madara"))
}
