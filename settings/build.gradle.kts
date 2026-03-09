plugins {
    id("android-compose-library")
}

android {
    namespace = "com.yandex.practicum.middle_homework_5.settings"
}

dependencies {
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.data.store)
    implementation(libs.koin.compose)
}