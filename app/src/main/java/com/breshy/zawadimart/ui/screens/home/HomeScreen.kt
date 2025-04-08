package com.breshy.zawadimart.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.R

@Composable
fun HomeScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Welcome to my Ecommerce App",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic
        )
        Image(
            painter = painterResource(R.drawable.shirts),
            contentDescription = "shirts"
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Add to cut")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}