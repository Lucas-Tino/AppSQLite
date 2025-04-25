package com.example.appsqlite

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar(navController: NavHostController, voltar: Boolean = false) {
    CenterAlignedTopAppBar(
        title = {Text(
            text = "Atualizar Filme",
            color = Color(255, 209, 26),
            fontSize = 30.sp
        ) },
        navigationIcon = {
            IconButton(onClick = {navController.popBackStack()}) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Voltar",
                    modifier = Modifier.padding(start = 2.dp)
                )
            }
        },
        colors = TopAppBarColors(
            containerColor = Color(0, 31, 77),
            scrolledContainerColor = Color(0, 31, 77),
            navigationIconContentColor = Color(255, 209, 26),
            titleContentColor = Color(255, 209, 26),
            actionIconContentColor = Color(255, 209, 26)
        )
    )
}