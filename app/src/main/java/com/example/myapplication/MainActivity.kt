package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
              HomeScreen1()

            }
        }
    }
}

@Composable
fun HomeScreen() {

    /*Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "my name is umair", color = Color.Blue)

    }*/
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "my name is umair khan", color = Color.White)
    }



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red), contentAlignment = Alignment.Center
    ) {
        Text(text = "khan ", color = Color.White, modifier = Modifier.background(Color.Black))
    }


}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SceondScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta),
        contentAlignment = Alignment.Center
    ) {


        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "",
            modifier = Modifier.background(color = Color.Black),
            tint = Color.White
        )
    }


}
