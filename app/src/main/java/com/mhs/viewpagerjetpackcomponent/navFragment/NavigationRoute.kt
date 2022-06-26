package com.mhs.viewpagerjetpackcomponent.navFragment

sealed class NavigationRoute(val route:String){
    object FirstScreen : NavigationRoute("firstScreen")
    object SecondScreen : NavigationRoute("{data}/secondScreen"){
        fun createRoute(data:String) = "$data/secondScreen"
    }
    object ThirdScreen : NavigationRoute("thirdScreen")
}
