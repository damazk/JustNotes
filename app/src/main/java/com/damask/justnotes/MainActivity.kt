package com.damask.justnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.damask.justnotes.navigation.Navigation
import com.damask.justnotes.ui.theme.JustNotesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustNotesTheme(dynamicColor = false) {
                Navigation()
            }
        }
    }
}