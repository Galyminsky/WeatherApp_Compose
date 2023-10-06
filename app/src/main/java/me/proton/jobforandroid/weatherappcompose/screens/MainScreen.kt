package me.proton.jobforandroid.weatherappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import me.proton.jobforandroid.weatherappcompose.R

@Preview (showBackground = true)
@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.oblaka_nebo_zheltyj),
        contentDescription = "image_back" )
}