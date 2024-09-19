package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FirstScreen() {

    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Home Screen", color = Color.Black)
        }, navigationIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "",
                modifier = Modifier.clickable { }, tint = Color.Black
            )
        }, actions = {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "", tint = Color.Black)
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "",
                tint = Color.Black
            )
        }, colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Yellow))
    }, floatingActionButton = {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Add, contentDescription ="" )
        }
    }) {

    }
}