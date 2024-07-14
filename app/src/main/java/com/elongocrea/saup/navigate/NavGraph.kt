package com.elongocrea.saup.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.elongocrea.saup.ui.screen.auth.LoginScreen
import com.elongocrea.saup.ui.screen.auth.RegisterScreen
import io.reactivex.rxjava3.disposables.CompositeDisposable

@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: String = "register"
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        val disposables = CompositeDisposable()

        composable("login") { LoginScreen(navController = navController) }
        composable("register") { RegisterScreen (navController = navController) }
    }
}