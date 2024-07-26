package com.example.jobAppHQ.job.navGraphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jobAppHQ.job.presentation.product_screen.StoreHomeScreen
import com.example.jobAppHQ.job.presentation.product_screen.StoreSignIn
import com.example.jobAppHQ.job.presentation.product_screen.StoreSignUp

@Composable
fun AuthNavGraph(
    authNavController: NavHostController,
) {
    NavHost(navController = authNavController, startDestination = AuthScreen.StoreSignUp.route) {

        composable(route = AuthScreen.StoreSignUp.route) {
            StoreSignUp(authNavController = authNavController, )
        }
        composable(route = AuthScreen.StoreSignIn.route) {
            StoreSignIn(authNavController = authNavController, )
        }


        composable(route = AuthScreen.StoreHomeScreen.route) {
           StoreHomeScreen()
        }

    }
}

sealed class AuthScreen(val route: String) {
    data object StoreSignUp : AuthScreen(route = "storeSignUp")
    data object StoreSignIn : AuthScreen(route = "storeSignIn")
    data object StoreHomeScreen : AuthScreen(route = "storeHomeScreen")
}