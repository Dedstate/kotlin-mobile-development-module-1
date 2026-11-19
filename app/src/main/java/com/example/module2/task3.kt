package com.example.module2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RenderButton(modifier: Modifier) {
    TextButton(
        onClick = {},
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
        border = BorderStroke(width = 2.dp, color = Color.Gray),
        shape = RoundedCornerShape(corner = CornerSize(size = 16.dp)),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 4.dp,
        )
    ) {
        Text(
            text = stringResource(R.string.button_text),
            letterSpacing = 1.sp
        )
    }
}