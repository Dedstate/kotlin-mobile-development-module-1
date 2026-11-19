package com.example.module2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.module2.ui.theme.Module2Theme

@Composable
fun RenderText1(modifier: Modifier) {
    Text(
        text = stringResource(R.string.compose_description),
        color = Color.Green,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Italic
    )
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun TextPreview1() {
    Module2Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            RenderText1(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
fun RenderText2(modifier: Modifier) {
    Text(
        text = stringResource(R.string.compose_description),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun TextPreview2() {
    Module2Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            RenderText2(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
fun RenderText3(modifier: Modifier) {
    Text(
        text = stringResource(R.string.compose_description),
        modifier = modifier.background(Color.Green),
        style = TextStyle(
            fontSize = 24.sp,
            color = Color.Black,
            textDecoration = TextDecoration.Underline,
            textIndent = TextIndent(firstLine = 48.sp)
        )
    )
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun TextPreview3() {
    Module2Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            RenderText3(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}