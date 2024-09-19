package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen1() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "homescreen")
            }, navigationIcon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "", )
            }, actions = {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "", )
                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", )
            }, colors = TopAppBarDefaults.largeTopAppBarColors(containerColor = Color.Magenta))

        }, floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")

            }
        }

    ) {
        Box(modifier = Modifier.fillMaxSize().padding(top = it.calculateTopPadding()), contentAlignment = Alignment.Center) {
            Text(text = "umiar khan", color = Color.Red, modifier = Modifier)
        }

    }
}