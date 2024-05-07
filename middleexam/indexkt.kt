package com.example.middleexam

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavigation(any: Any?) {
    TODO("Not yet implemented")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IndexScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "MiddleExam") }) },
        bottomBar = { BottomNavigation(...) }
    ) { innerPadding ->
        NavHost(
            navController = rememberNavController(),
            startDestination = "commodity_page"
        ) {
            composable("commodity_page") {
                val navController = null
                navController?.let { it1 -> Commodity(it1) }
            }
            composable("equipment_page") {
                val navController = null
                navController?.let { it1 -> Equipment(it1) }
            }
            composable("end_page") {
                val navController = null
                navController?.let { it1 -> EndPage(it1) }
            }
        }
    }
}
@Composable
fun Commodity() {
    val commodityList = remember { commodities }
    Text(text = "Commodity Count: ${commodityList.count()}")
}

@Composable
fun Equipment() {
    val equipmentList = remember { equipment }
    Text(text = "Equipment Count: ${equipmentList.count()}")
}