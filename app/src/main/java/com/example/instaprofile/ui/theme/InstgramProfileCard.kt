package com.example.instaprofile.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun InstagramProfileCard(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(modifier = Modifier
            .size(50.dp)
            .background(color = Color.Green)) {

        }
        TwoBoxes(
            //Text(text = "6,950"),
            //Text(text = "6,950")
        )
        TwoBoxes(
            //Text(text = "436M"),
            //Text(text = "Followers")
        )
        TwoBoxes(
            //Text(text = "76"),
            //Text(text = "Following")
        )
    }
}

@Composable
private fun TwoBoxes(){
    Column(modifier = Modifier ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(modifier = Modifier
            .size(50.dp)
            .background(color = Color.Yellow))
        Box(modifier = Modifier
            .size(50.dp)
            .background(color = Color.Gray))
    }
}