package com.example.instaprofile.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaprofile.R

@Composable
fun InstagramProfileCard(){
    Card(modifier = Modifier
        .padding(top = 40.dp, end = 8.dp, bottom = 8.dp, start = 8.dp)
        .background(color = MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)
        ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(color = Color.White),
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = "",
                    contentScale = ContentScale.Fit
                )

                UserStatistics(title = "Posts", value = "6,950")

                UserStatistics(title = "Followers", value = "436M")

                UserStatistics(title = "Following", value = "76")
            }

            Text(text = "Instagram",fontSize = 32.sp,fontFamily = FontFamily.Cursive )
            Text(text = "#YoursToMake",fontSize = 14.sp)
            Text(text = "ww.facebook.com/emotional_health",fontSize = 14.sp)
            Button(onClick = {}) {
                Text(text = "Follow")
            }
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