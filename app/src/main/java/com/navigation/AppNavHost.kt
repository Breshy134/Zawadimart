package com.breshy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.navigation.ROUT_HOME
import com.breshy.zawadimart.navigation.ROUT_ABOUT
import com.breshy.zawadimart.navigation.ROUT_DASHBOARD
import com.breshy.zawadimart.navigation.ROUT_FORM
import com.breshy.zawadimart.navigation.ROUT_ITEM
import com.breshy.zawadimart.navigation.ROUT_START
import com.breshy.zawadimart.navigation.ROUT_INTENT
import com.breshy.zawadimart.navigation.ROUT_SERVICE
import com.breshy.zawadimart.navigation.ROUT_SPLASH
import com.breshy.zawadimart.ui.screens.about.AboutScreen
import com.breshy.zawadimart.ui.screens.dashboard.DashboardScreen
import com.breshy.zawadimart.ui.screens.home.HomeScreen
import com.breshy.zawadimart.ui.screens.intent.IntentScreen
import com.breshy.zawadimart.ui.screens.item.ItemScreen
import com.breshy.zawadimart.ui.screens.service.ServiceScreen
import com.breshy.zawadimart.ui.screens.start.StartScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_FORM
) {

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

    }
}