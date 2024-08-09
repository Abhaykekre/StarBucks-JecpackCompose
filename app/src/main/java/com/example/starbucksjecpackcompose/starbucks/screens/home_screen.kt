package com.example.starbucksjecpackcompose.starbucks.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ModalBottomSheetDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.starbucksjecpackcompose.R
import com.example.starbucksjecpackcompose.starbucks.components.AppIconComponent
import com.example.starbucksjecpackcompose.starbucks.components.LogoComponent
import com.example.starbucksjecpackcompose.ui.theme.Background

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {
           Header()
            LazyColumn (
                modifier = Modifier.fillMaxSize()
            ) {
                item {
                    TextDescription()
                }
            }
        }

    }

}



@Composable
fun TextDescription()
{
    Text(
        text = stringResource(id = R.string.our_way_of_loving_you_back),
        style = TextStyle(
            fontSize = 25.sp,
            fontWeight = FontWeight.W600,
            color = Color.Black,
        ),
        modifier = Modifier.padding(vertical = 30.dp,)
        )
}


@Composable
private fun Header()
{
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ){
         AppIconComponent(icon = R.drawable.menu)
         LogoComponent(size = 58.dp)
        AppIconComponent(icon = R.drawable.bag)
    }
}

