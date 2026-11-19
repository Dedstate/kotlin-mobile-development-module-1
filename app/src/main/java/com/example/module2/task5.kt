package com.example.module2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.module2.ui.theme.Module2Theme

@Composable
fun CircleComponent(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 32.dp)
                .aspectRatio(1f)
                .background(
                    color = Color.Red,
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.name)
            )
        }
    }
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun CirclePreview() {
    Module2Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            CircleComponent(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}