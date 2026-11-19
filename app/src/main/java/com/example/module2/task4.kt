package com.example.module2

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.module2.ui.theme.Module2Theme

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun ButtonPreview() {
    Module2Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            RenderButton(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}