package com.example.module2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.module2.ui.theme.Module2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Module2Theme {}
        }
    }
}

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