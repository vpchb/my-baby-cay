//package com.example.middleexam
//
//import   android.os.Bundle
//import androidx.activity.compose.setContent
//import androidx.appcompat.app.AppCompatActivity
//import androidx.compose.foundation.layout.Column
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import org.intellij.lang.annotations.Language
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "commodity") {
//                composable("commodity") { Commodity(navContorller) }
//                composable("equipment") { Equipment(navContorller) }
//                composable("end") { EndPage(navContorller) }
//            }
//        }
//    }
//
//}
//@Composable
//fun Navigator(navController: String) {
//    val navContorller = rememberNavController()
//    NavHost(navController = navContorller, startDestination = "Home" ){
//        composable("Laucher"){ Language(navController)}
//        composable("Home"){Homepage(navController)}
//        composable("A"){Apage(navController)}
//        composable("B"){Bpage(navController)}
//        composable("C"){Cpage(navController)}
//    }
//}
//
//@Composable
//fun Homepage(navController: NavController){
//    Column {
//        Button(onClick = {
//            navController.navigate("A")
//        }) {
//            Text(text = "A")
//        }
//    }
//    Column {
//        Button(onClick = {
//            navController.navigate("A")
//        }) {
//            Text(text = "B")
//        }
//    }
//    Column {
//        Button(onClick = {
//            navController.navigate("A")
//        }) {
//            Text(text = "C")
//        }
//    }
//}
//@Composable
//@Preview(showSystemUi = true)
//fun previeHost(){
//    Navigator()
//}
package com.example.middleexam

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "commodity") {
                composable("commodity") { Commodity(navController) }
                composable("equipment") { Equipment(navController) }
                composable("end") { EndPage(navController) }
            }
        }
    }
}
@Composable
fun Commodity(navController: NavController) {
}

@Composable
fun Equipment(navController: NavController) {
}

@Composable
fun EndPage(navController: NavController) {
    Button(onClick = { /* 你的逻辑 */ }) {
        Text(text = "Exam Over")
    }
}
@Composable
fun Homepage(navController: NavController) {
    Column {
        Button(onClick = { navController.navigate("commodity") }) {
            Text(text = "A")
        }
        Button(onClick = { navController.navigate("equipment") }) {
            Text(text = "B")
        }
        Button(onClick = { navController.navigate("end") }) {
            Text(text = "C")
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun PreviewHomepage() {
    Homepage(navController = rememberNavController())
}