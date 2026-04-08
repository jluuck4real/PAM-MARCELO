package com.example.logcatbutton.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = DevBlue,
    secondary = DevGreen,
    tertiary = DevOrange,
    background = MatteBlack,
    surface = MatteBlack,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun LogcatButtonTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {

    val colorScheme = DarkColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun DebugButtonColors() = ButtonDefaults.buttonColors(
    containerColor = DevGreen,
    contentColor = Color.White
)

@Composable
fun WarningButtonColors() = ButtonDefaults.buttonColors(
    containerColor = DevOrange,
    contentColor = Color.White
)

@Composable
fun ErrorButtonColors() = ButtonDefaults.buttonColors(
    containerColor = DevRed,
    contentColor = Color.White
)

@Composable
fun InfoButtonColors() = ButtonDefaults.buttonColors(
    containerColor = DevBlue,
    contentColor = Color.White
)