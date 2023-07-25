package com.example.gastosmensais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.gastosmensais.composables.WelcomeScreen
import com.example.gastosmensais.ui.theme.GastosMensaisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GastosMensaisTheme {
                WelcomeScreen()
            }
        }
    }
}

