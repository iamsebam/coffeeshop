package com.sebastianmatyjaszczyk.libcompose.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun PrimaryTextView(text: String) =
    Text(text = text, color = MaterialTheme.colors.primaryVariant)
