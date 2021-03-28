object Dependencies {
    object Versions {
        // Gradle plugins
        const val dependencyUpdates = "0.38.0"

        // KotlinX
        const val coroutines = "1.4.3"

        // Core
        const val koin = "2.1.6"
        const val appCompat = "1.3.0-rc01"
        const val androidxCore = "1.5.0-beta03"
        const val activity = "1.2.1"
        const val fragment = "1.3.1"
        const val exoPlayer = "2.12.3"

        // Lifecycle
        const val lifecycleExtensions = "2.3.0"

        // UI
        const val constraintLayout = "2.0.4"
        const val material = "1.3.0"
        const val palette = "1.0.0"
        const val webkitX = "1.4.0"
        const val modernAndroidPreferences = "2.0"

        // Compose
        const val compose = "1.0.0-beta03"
        const val composeRouter = "0.24.2"
        const val accompanist = "0.7.0"

        // Room
        const val room = "2.2.6"

        // Network
        const val apiclient = "0.7.9"
        const val okHttp = "4.9.1"
        const val coil = "1.1.1"

        // Cast
        const val mediaRouter = "1.2.2"
        const val playServicesCast = "19.0.0"

        // Media
        const val media = "1.2.1"

        // Health
        const val timber = "4.7.1"
        const val leakCanary = "2.6"
        const val redScreenOfDeath = "0.1.2"
        const val junit = "5.7.1"
        const val kotest = "4.4.3"
        const val mockk = "1.11.0"
        const val androidXRunner = "1.3.0"
        const val androidXEspresso = "3.3.0"
    }

    object Kotlin {
        val coroutinesCore = kotlinx("coroutines-core", Versions.coroutines)
        val coroutinesAndroid = kotlinx("coroutines-android", Versions.coroutines)
    }

    object Core {
        const val koin = "org.koin:koin-android:${Versions.koin}"
        const val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
        val appCompat = androidx("appcompat", Versions.appCompat)
        val androidx = androidxKtx("core", Versions.androidxCore)
        val activity = androidxKtx("activity", Versions.activity)
        val fragment = androidxKtx("fragment", Versions.fragment)
        const val koinFragment = "org.koin:koin-androidx-fragment:${Versions.koin}"
        val exoPlayer = exoPlayer("core")
    }

    object Lifecycle {
        val viewModel = lifecycle("viewmodel-ktx")
        val liveData = lifecycle("livedata-ktx")
        val runtime = lifecycle("runtime-ktx")
        val common = lifecycle("common-java8")
        val process = lifecycle("process")
        val compose = lifecycle("viewmodel-compose", "1.0.0-alpha01")
    }

    object UI {
        val constraintLayout = androidx("constraintlayout", Versions.constraintLayout)
        const val material = "com.google.android.material:material:${Versions.material}"
        val palette = androidx("palette", Versions.palette)
        val webkitX = androidx("webkit", Versions.webkitX)
        val exoPlayer = exoPlayer("ui")
        const val modernAndroidPreferences = "de.maxr1998:modernandroidpreferences:${Versions.modernAndroidPreferences}"
    }

    object Compose {
        val runtime = compose("runtime")
        val ui = compose("ui")
        val foundation = compose("foundation")
        val animation = compose("animation")
        val material = compose("material")
        val materialIcons = compose("material", "icons-core")
        val materialIconsExtended = compose("material", "icons-extended")
        val runtimeLiveData = compose("runtime", "livedata")
        const val composeRouter = "com.github.zsoltk:compose-router:${Versions.composeRouter}"
        const val accompanistCoil = "com.google.accompanist:accompanist-coil:${Versions.accompanist}"
        const val accompanistPager = "com.google.accompanist:accompanist-pager:${Versions.accompanist}"
    }

    object Room {
        val runtime = room("runtime")
        val compiler = room("compiler")
    }

    object Network {
        const val apiclient = "org.jellyfin.apiclient:android:${Versions.apiclient}"
        const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val coil = "io.coil-kt:coil:${Versions.coil}"
        val exoPlayerHLS = exoPlayer("hls")
    }

    object Cast {
        val mediaRouter = androidx("mediarouter", Versions.mediaRouter)
        const val exoPlayerCastExtension = "com.google.android.exoplayer:extension-cast:${Versions.exoPlayer}"
        const val playServicesCast = "com.google.android.gms:play-services-cast:${Versions.playServicesCast}"
        const val playServicesCastFramework = "com.google.android.gms:play-services-cast-framework:${Versions.playServicesCast}"
    }

    object Media {
        val media = androidx("media", Versions.media)
        var exoPlayerMediaSession = "com.google.android.exoplayer:extension-mediasession:${Versions.exoPlayer}"
    }

    /**
     * Includes logging, debugging, and testing
     */
    object Health {
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
        const val redScreenOfDeath = "com.melegy.redscreenofdeath:red-screen-of-death:${Versions.redScreenOfDeath}"
        const val redScreenOfDeathNoOp = "com.melegy.redscreenofdeath:red-screen-of-death-no-op:${Versions.redScreenOfDeath}"
        const val junit = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
        const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
        const val kotestAssertions = "io.kotest:kotest-assertions-core-jvm:${Versions.kotest}"
        const val kotestProperty = "io.kotest:kotest-property-jvm:${Versions.kotest}"
        const val kotestRunner = "io.kotest:kotest-runner-junit5-jvm:${Versions.kotest}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
        const val androidXRunner = "androidx.test:runner:${Versions.androidXRunner}"
        const val androidXEspresso = "androidx.test.espresso:espresso-core:${Versions.androidXEspresso}"
    }

    // Helpers
    private fun androidx(module: String, version: String) = androidx(module, null, version)
    private fun androidx(module: String, variant: String?, version: String) = "androidx.$module:$module${variant?.let { "-$it" } ?: ""}:$version"
    private fun androidxKtx(module: String, version: String) = "androidx.$module:$module-ktx:$version"
    private fun kotlinx(module: String, version: String) = "org.jetbrains.kotlinx:kotlinx-$module:$version"
    private fun lifecycle(module: String, version: String = Versions.lifecycleExtensions) = "androidx.lifecycle:lifecycle-$module:${version}"
    private fun room(module: String) = "androidx.room:room-$module:${Versions.room}"
    private fun compose(module: String, variant: String? = null) = "androidx.compose.$module:$module${variant?.let { "-$it" } ?: ""}:${Versions.compose}"
    private fun exoPlayer(module: String) = "com.google.android.exoplayer:exoplayer-$module:${Versions.exoPlayer}"
}
