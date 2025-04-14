package com.breshy.zawadimart.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.R
import com.breshy.zawadimart.ui.theme.newBlue
import com.breshy.zawadimart.ui.theme.newdarkblue
import com.breshy.zawadimart.ui.theme.neworange
import com.breshy.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form1Screen(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(newdarkblue)
            .verticalScroll(rememberScrollState())

    ){
        Row (){
            Image(
                painter = painterResource(R.drawable.img_5),
                contentDescription = "",
                modifier = Modifier.size(130.dp).padding(start = 60.dp)
            )
            Text(
                text = "Logo App",
                color = newwhite,
                fontSize = 40.sp,
                modifier = Modifier.padding(start = 20.dp, top = 45.dp)
            )
        }
        Image(
            painter = painterResource(R.drawable.img_6),
            contentDescription = "",
            modifier = Modifier.size(300.dp).padding(start = 100.dp, top = 20.dp)
        )

        //Card
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .offset(y = 10.dp),
            shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
            colors = CardDefaults.cardColors(newwhite)
        ){
            Text(
                text = "The Most Worthy",
                color = neworange,
                fontSize = 35.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 50.dp, top = 35.dp)
            )
            Text(
                text = "Grocery App",
                color = neworange,
                fontSize = 35.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 80.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            //variables
            var username by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            //End of variables

            TextField(
                value = username,
                onValueChange = {username = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                label = {Text(
                    text = "Username",
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 120.dp)
                )},

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                value = password,
                onValueChange = {password = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                label = {Text(
                    text = "Password",
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 120.dp)
                )},

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()

            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(neworange),
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
            ) {
                Text(
                    text = "Sign Up",
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Already Are Members? Log in",
                modifier = Modifier.padding(start = 120.dp)
            )
        }
        //End of Card


    }
}

@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())
}