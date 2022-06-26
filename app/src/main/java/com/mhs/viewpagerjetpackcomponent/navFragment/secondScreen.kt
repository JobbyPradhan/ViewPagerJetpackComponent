package com.mhs.viewpagerjetpackcomponent.navFragment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation

@Composable
fun SecondScreen(navController: NavHostController,data:String?){
    Column(modifier = Modifier.fillMaxSize(1f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "This is Screen Screen")
        Button(onClick = {
            navController.navigate(NavigationRoute.ThirdScreen.route){
               /* popUpTo(NavigationRoute.FirstScreen.route){
                    inclusive = false
                }*/
                launchSingleTop = true
            }
        }) {
            Text(text = "Go to Third $data")
        }

    }
}