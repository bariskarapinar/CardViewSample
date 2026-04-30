package com.myapp.cardviewsample.model

import androidx.compose.ui.graphics.Color

data class ColorfulItem(
    val id: Int,
    val title: String,
    val description: String,
    val backgroundColor: Color,
    val icon: String // Using a string to represent an emoji or symbol for simplicity
)
