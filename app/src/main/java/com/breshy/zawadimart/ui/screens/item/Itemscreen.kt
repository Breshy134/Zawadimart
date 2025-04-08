package com.breshy.zawadimart.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.R
import com.breshy.zawadimart.navigation.ROUT_INTENT
import com.breshy.zawadimart.ui.theme.newBlue
import com.breshy.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newBlue,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            }
        )
        //End of TopAppBar

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "shirts",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))

        //SearchBar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder = {Text(text = "Search...")}
        )
        //End of SearchBar
        Spacer(modifier = Modifier.height(10.dp))

        //Row
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.fashion),
                contentDescription = "shirts",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column (){
                Text(
                    text = "Men's Outfit",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Ksh.6000",
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = "Price : Ksh.6000",
                    fontSize = 15.sp,
                )
                Row (){
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )

                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newBlue),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Contact is")
                }
            }
        }
        //End of Row

        Spacer(modifier = Modifier.height(10.dp))

        //Row
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.fashion),
                contentDescription = "shirts",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column (){
                Text(
                    text = "Men's Outfit",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Ksh.6000",
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = "Price : Ksh.6000",
                    fontSize = 15.sp,
                )
                Row (){
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )

                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newBlue),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Contact is")
                }
            }
        }
        //End of Row

        Spacer(modifier = Modifier.height(10.dp))

        //Row
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.fashion),
                contentDescription = "shirts",
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column (){
                Text(
                    text = "Men's Outfit",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Ksh.6000",
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = "Price : Ksh.6000",
                    fontSize = 15.sp,
                )
                Row (){
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )
                    Icon(
                        imageVector = Icons.Default.Star, contentDescription = "",
                        tint = newBlue
                    )

                }

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newBlue),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Contact is")
                }
            }
        }
        //End of Row
    }
}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController = rememberNavController())
}