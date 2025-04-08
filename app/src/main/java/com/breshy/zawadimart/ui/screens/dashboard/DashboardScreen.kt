package com.breshy.zawadimart.ui.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.ui.theme.newBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {
    Column (modifier = Modifier.fillMaxSize()){

        //Card
        Card (
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
            colors = CardDefaults.cardColors(newBlue)
        ){
            TopAppBar(
                title = { Text(text = "Dashboard Section") }
            )
        }
        //End of Card
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}