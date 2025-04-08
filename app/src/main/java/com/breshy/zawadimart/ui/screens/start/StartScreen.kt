package com.breshy.zawadimart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.R
import com.breshy.zawadimart.ui.theme.newBlue

@Composable
fun StartScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "ZawadiMart")

        Spacer(modifier = Modifier.height(20.dp))

        //Circular Image
        Image(
            painter = painterResource(R.drawable.mart),
            contentDescription = "",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        //End
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find your order!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = newBlue
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Best-Selling Categories · Dairy Products · Flour,Sugar & Salt · Quickmart Veges · Juices & Carbonates · Snack Foods (Salty) · Tissue · Beverages · Spices & Sauces.",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(newBlue),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(text = "Get Started")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(navController = rememberNavController())
}