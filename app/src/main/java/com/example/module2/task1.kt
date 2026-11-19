package com.example.module2

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.module2.ui.theme.Module2Theme

@Composable
fun Hello(name: String?, modifier: Modifier = Modifier) {
    val msg = if (name.isNullOrEmpty()) "Имя не задано" else "Hello, $name!"

    Text(
        text = msg, modifier = modifier
    )
}


@Preview(
    name = "Portrait", device = "spec:parent=pixel_5,orientation=portrait", showSystemUi = true
)
@Preview(
    name = "Landscape", device = "spec:parent=pixel_5,orientation=landscape", showSystemUi = true
)
@Preview(
    name = "Round",
    device = "spec:width=200dp,height=200dp,dpi=320,isRound=true",
    showSystemUi = true,
    showBackground = true,
    backgroundColor = 0xFFFFFF00
)
@Composable
fun HelloPreview() {
    Module2Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Hello(
                name = "Android", modifier = Modifier.padding(innerPadding)
            )
        }
    }
}