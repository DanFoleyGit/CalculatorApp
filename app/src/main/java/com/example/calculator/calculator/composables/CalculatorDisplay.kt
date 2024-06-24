package com.example.calculator.calculator.composables

import android.widget.HorizontalScrollView
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorDisplay(
    value:String = "",
) {

    Text(
        text = value,
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 50.dp),
        style = TextStyle(fontSize = 30.sp),
        maxLines = 3
    )

}