package com.daniel.funzone.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColors(
    primary = Purple80,
    background = chineseBlack,
    secondary = PurpleGrey80
)

@Composable
fun FunZoneTheme(content: @Composable () -> Unit) {
    val colors = DarkColorScheme

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}