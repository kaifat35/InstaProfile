package com.example.instaprofile.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InstagramProfileCard(){
    Card(modifier = Modifier
        .padding(8.dp)
        .background(color = MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)
        ) {
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
            UserStatistics(title = "Posts", value = "6,950")

            UserStatistics(value = "436M", title = "Followers")

            UserStatistics(value = "76", title = "Following")
        }
    }

}

@Composable
private fun UserStatistics(
    title: String,
    value: String
){
    Column(modifier = Modifier ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = value, fontSize = 32.sp , fontFamily = FontFamily.Cursive )
        Text(text = title, fontWeight = Bold )
    }
}

@Preview
@Composable
fun PreviewCardLight(){
    InstaProfileTheme(
        darkTheme = false
    ) {

        InstagramProfileCard()

    }
}

@Preview
@Composable
fun PreviewCardDark(){
    InstaProfileTheme(
        darkTheme = true
    ) {
        InstagramProfileCard()

    }
}