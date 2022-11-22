package com.example.mvvmkotlin.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmkotlin.ui.home.HomeScreen


@Composable
fun RickAndMortyNavGraph(
    modifier: Modifier = Modifier,
    navigateToHome: ()-> Unit,
    navigateToDetail: (Int) -> Unit,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screen.Home.route
){
    NavHost(
        navController= navController,
        startDestination = startDestination,
        modifier = modifier
    ){
        composable(route = Screen.Home.route){
            HomeScreen(
                onItemClicked = { navigateToDetail(it) }
            )
        }
    }
}