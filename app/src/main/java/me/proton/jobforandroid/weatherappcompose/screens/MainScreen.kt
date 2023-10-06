package me.proton.jobforandroid.weatherappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import me.proton.jobforandroid.weatherappcompose.R
import me.proton.jobforandroid.weatherappcompose.ui.theme.Purple40

@Preview (showBackground = true)
@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.oblako_luna_nebo),
        contentDescription = "image_back",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.5f),
        contentScale = ContentScale.Crop
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),

    ){
    Card(
        modifier = Modifier.fillMaxWidth().background(Purple40),
        shape = RoundedCornerShape(10.dp)

    ) {

    }
    }
}