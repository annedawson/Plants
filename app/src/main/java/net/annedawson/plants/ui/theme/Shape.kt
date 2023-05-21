package net.annedawson.plants.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

// components are categorized into small, medium and large
// e.g. buttons are an example of small, a card is a medium sized component

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),  // e.g. a text field or button component
    medium = RoundedCornerShape(16.dp), // e.g. a menu or a card component
    large = RoundedCornerShape(0.dp)
)

// https://youtu.be/TREPYpUvGRM?t=859  (this file explained)

// since an image is not a component,
// you have to apply RoundedCornerShape directly to it in MainActivity.kt

