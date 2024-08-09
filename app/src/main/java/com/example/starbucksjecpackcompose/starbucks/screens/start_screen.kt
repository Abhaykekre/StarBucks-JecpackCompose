package com.example.starbucksjecpackcompose.starbucks.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.navigation.NavHostController
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.starbucksjecpackcompose.starbucks.components.LogoComponent
import com.example.starbucksjecpackcompose.starbucks.navigation.home
import com.example.starbucksjecpackcompose.ui.theme.Background
import kotlinx.coroutines.delay


@Composable
fun StartScreen(
    navHostController : NavHostController
)
{

    LaunchedEffect(key1 = Unit) {
        delay(2000)
        navHostController.navigate(home)
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Background), contentAlignment = Alignment.Center )
    {
        LogoComponent()
    }
    
}
