package com.breshy.zawadimart.ui.screens.info

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.breshy.zawadimart.R
import com.breshy.zawadimart.navigation.ROUT_HOME
import com.breshy.zawadimart.ui.theme.newBlue
import com.breshy.zawadimart.ui.theme.newgreen
import com.breshy.zawadimart.ui.theme.neworange
import com.breshy.zawadimart.ui.theme.newwhite

@Composable
fun InfoScreen(navController: NavHostController) {
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newBlue
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {



                //Main Contents of the page
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "Hi Samantha",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp),
                )
                Text(
                    text = "Here are your projects",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp),
                )

                Spacer(modifier = Modifier.height(40.dp))
                //Row
                Row (
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())
                ){
                    //Card1
                    Card (
                        modifier = Modifier
                            .width(150.dp)
                            .height(180.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize().padding(start = 20.dp).background(newBlue),
                            verticalArrangement = Arrangement.Center
                        ){

                            Text(text = "Cryptocurrency", fontSize = 15.sp)
                            Text(text = "Landing Page", fontSize = 15.sp)
                        }
                    }
                    //End of Card1
                    Spacer(modifier = Modifier.width(20.dp))
                    //Card2
                    Card (
                        modifier = Modifier
                            .width(150.dp)
                            .height(180.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize().background(neworange), horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){

                            Text(text = "Statistics", fontSize = 15.sp)
                            Text(text = "Dashboard", fontSize = 15.sp)
                        }
                    }
                    //End of Card2
                    Spacer(modifier = Modifier.width(20.dp))
                    //Card3
                    Card (
                        modifier = Modifier
                            .width(150.dp)
                            .height(180.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize().background(newgreen), horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){

                            Text(text = "", fontSize = 15.sp)
                        }
                    }
                    //End of Card3

                }
                //End of Row
                Spacer(modifier = Modifier.height(40.dp))
                //Row
                Row (
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())
                ){
                    //Card1
                    Card (
                        modifier = Modifier
                            .width(350.dp)
                            .height(500.dp)
                    ){
                        Column (){
                            Text(
                                text = "Personal Task",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 30.dp, top = 20.dp),
                            )
                            Spacer(modifier = Modifier.height(40.dp))
                            Card (
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                                    .padding(start = 20.dp, end = 20.dp)
                            ){
                                Row (
                                    modifier = Modifier
                                        .background(newwhite)
                                ){
                                    Image(
                                        painter = painterResource(R.drawable.img_1),
                                        contentDescription = "shirts",
                                        modifier = Modifier.size(100.dp)
                                    )
                                    Column (
                                        modifier = Modifier.padding(top = 20.dp)
                                    ){
                                        Text(text = "NDA Review for website project", fontWeight = FontWeight.Bold)
                                        Text(text = "Today - 10pm")
                                    }
                                }
                                Spacer(modifier = Modifier.height(25.dp))
                                Row (
                                    modifier = Modifier
                                        .background(newwhite)
                                ){
                                    Image(
                                        painter = painterResource(R.drawable.img_2),
                                        contentDescription = "shirts",
                                        modifier = Modifier.size(100.dp)
                                    )
                                    Column (
                                        modifier = Modifier.padding(top = 20.dp)
                                    ){
                                        Text(text = "NDA Review for website project", fontWeight = FontWeight.Bold)
                                        Text(text = "Today - 10pm")
                                    }
                                }
                                Row (
                                    modifier = Modifier
                                        .background(newwhite)
                                ){
                                    Image(
                                        painter = painterResource(R.drawable.img_1),
                                        contentDescription = "shirts",
                                        modifier = Modifier.size(100.dp)
                                    )
                                    Column (
                                        modifier = Modifier.padding(top = 20.dp)
                                    ){
                                        Text(text = "NDA Review for website project", fontWeight = FontWeight.Bold)
                                        Text(text = "Today - 10pm")
                                    }
                                }
                                Spacer(modifier = Modifier.height(25.dp))
                                Row (
                                    modifier = Modifier
                                        .background(newwhite)
                                ){
                                    Image(
                                        painter = painterResource(R.drawable.img_2),
                                        contentDescription = "shirts",
                                        modifier = Modifier.size(100.dp)
                                    )
                                    Column (
                                        modifier = Modifier.padding(top = 20.dp)
                                    ){
                                        Text(text = "NDA Review for website project", fontWeight = FontWeight.Bold)
                                        Text(text = "Today - 10pm")
                                    }
                                }
                            }
                        }
                    }
                    //End of Card1
                    Spacer(modifier = Modifier.width(20.dp))


                }
                //End of Row


            }
        }
    )

    //End of scaffold
}

@Preview(showBackground = true)
@Composable
fun InfoScreenPreview(){
    InfoScreen(rememberNavController())
}