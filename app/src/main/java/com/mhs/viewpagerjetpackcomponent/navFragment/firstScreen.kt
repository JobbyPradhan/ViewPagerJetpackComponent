package com.mhs.viewpagerjetpackcomponent.navFragment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun FirstScreen(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
        Text(text = "This is First Screen")
        Button(onClick = {
            navController.navigate(NavigationRoute.SecondScreen.createRoute("Hi"))
        },modifier = Modifier.padding(10.dp)) {
            Text(text = "Go to Screen Screen")
        }

    }
}