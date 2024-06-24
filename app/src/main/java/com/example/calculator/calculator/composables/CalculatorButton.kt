package com.example.calculator.calculator.composables

//import androidx.compose.foundation.layout.FlowColumnScopeInstance.weight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    text: String = "",
    onClickMethod: (String) -> Unit,
    width: Int = 80,
) {
    Button(
        modifier = Modifier.padding(10.dp)
            .width(width.dp).height(80.dp),
        onClick = { onClickMethod(text) },
        shape = ButtonDefaults.shape,
    ) {
        Text(text = text, style = MaterialTheme.typography.headlineMedium )
    }
}