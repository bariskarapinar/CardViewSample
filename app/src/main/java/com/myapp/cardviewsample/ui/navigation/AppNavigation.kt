package com.myapp.cardviewsample.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.myapp.cardviewsample.ui.components.CardDetailScreen
import com.myapp.cardviewsample.ui.components.CardListScreen
import com.myapp.cardviewsample.viewmodel.CardViewModel

@Composable
fun AppNavigation(viewModel: CardViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            CardListScreen(
                viewModel = viewModel,
                onItemClick = { itemId ->
                    navController.navigate("detail/$itemId")
                }
            )
        }
        composable(
            route = "detail/{itemId}",
            arguments = listOf(navArgument("itemId") { type = NavType.IntType })
        ) { backStackEntry ->
            val itemId = backStackEntry.arguments?.getInt("itemId") ?: 0
            CardDetailScreen(
                itemId = itemId,
                viewModel = viewModel,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
