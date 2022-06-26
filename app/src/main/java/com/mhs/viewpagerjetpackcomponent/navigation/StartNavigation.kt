package com.mhs.viewpagerjetpackcomponent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mhs.viewpagerjetpackcomponent.navFragment.FirstScreen
import com.mhs.viewpagerjetpackcomponent.navFragment.NavigationRoute
import com.mhs.viewpagerjetpackcomponent.navFragment.SecondScreen
import com.mhs.viewpagerjetpackcomponent.navFragment.ThirdScreen

@Composable
fun StartNavigation(){
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = NavigationRoute.FirstScreen.route){
        composable(NavigationRoute.FirstScreen.route){
            FirstScreen(navController = navController)
        }
        composable(NavigationRoute.SecondScreen.route){
            val data = it.arguments?.getString("data")
            SecondScreen(navController = navController,data)
        }
        composable(NavigationRoute.ThirdScreen.route){
            ThirdScreen()
        }
    }

}