package com.breshy.zawadimart.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.R
import com.breshy.zawadimart.navigation.ROUT_DASHBOARD
import com.breshy.zawadimart.navigation.ROUT_LOGIN
import com.breshy.zawadimart.navigation.ROUT_START
import com.breshy.zawadimart.ui.theme.newBlue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {

    //Navigation
    val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_LOGIN)
    }
    //End if Navigation

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(newBlue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "shirts",
            modifier = Modifier.size(300.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}