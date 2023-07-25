package com.example.gastosmensais.composables

import androidx.annotation.ColorInt
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.gastosmensais.R
import com.example.gastosmensais.ui.theme.BlueGM
import com.example.gastosmensais.ui.theme.GrayGM
import com.example.gastosmensais.ui.theme.RedGM

@Composable
fun WelcomeInputs() {

}

@Composable
fun WelcomeUpperPanel() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(GrayGM)
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.gmicon),
                contentDescription = "logo",
                modifier = Modifier.fillMaxWidth(0.9f)
            )
            Row() {
                Text(
                    text = "Gastos",
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    color = RedGM,
                )
                Text(
                    text = " Mensais",
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    color = BlueGM,
                )
            }
        }

    }
}

@Preview
@Composable
fun WelcomeScreen() {
    WelcomeUpperPanel()


}