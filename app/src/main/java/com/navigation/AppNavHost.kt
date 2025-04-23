package com.breshy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.data.UserDatabase
import com.breshy.zawadimart.navigation.ROUT_HOME
import com.breshy.zawadimart.navigation.ROUT_ABOUT
import com.breshy.zawadimart.navigation.ROUT_DASHBOARD
import com.breshy.zawadimart.navigation.ROUT_FORM
import com.breshy.zawadimart.navigation.ROUT_FORM1
import com.breshy.zawadimart.navigation.ROUT_ITEM
import com.breshy.zawadimart.navigation.ROUT_START
import com.breshy.zawadimart.navigation.ROUT_INTENT
import com.breshy.zawadimart.navigation.ROUT_LOGIN
import com.breshy.zawadimart.navigation.ROUT_PRODUCT_LIST
import com.breshy.zawadimart.navigation.ROUT_REGISTER
import com.breshy.zawadimart.navigation.ROUT_SERVICE
import com.breshy.zawadimart.navigation.ROUT_SPLASH
import com.breshy.zawadimart.repository.UserRepository
import com.breshy.zawadimart.ui.screens.about.AboutScreen
import com.breshy.zawadimart.ui.screens.auth.LoginScreen
import com.breshy.zawadimart.ui.screens.auth.RegisterScreen
import com.breshy.zawadimart.ui.screens.dashboard.DashboardScreen
import com.breshy.zawadimart.ui.screens.home.HomeScreen
import com.breshy.zawadimart.ui.screens.intent.IntentScreen
import com.breshy.zawadimart.ui.screens.item.ItemScreen
import com.breshy.zawadimart.ui.screens.service.ServiceScreen
import com.breshy.zawadimart.ui.screens.start.StartScreen
import com.breshy.zawadimart.viewmodel.AuthViewModel
import com.breshy.zawadimart.viewmodel.ProductViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_PRODUCT_LIST,
    //productViewModel: ProductViewModel = ViewModel(),
) {


    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            ServiceScreen(navController)
        }
        composable(ROUT_FORM) {
            ServiceScreen(navController)
        }
        composable(ROUT_FORM1) {
            ServiceScreen(navController)
        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }

        //98 -> 115

    }
}