// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version ("7.4.2") apply false
    id ("com.android.library") version ("7.4.2") apply false
    id ("org.jetbrains.kotlin.android") version ("1.8.0") apply false

    //safe_args_navigation
    id ("androidx.navigation.safeargs") version ("2.5.3") apply false

    //hilt
    id ("com.google.dagger.hilt.android") version ("2.45") apply false
}