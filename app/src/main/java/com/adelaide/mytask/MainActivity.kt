package com.adelaide.mytask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.BorderStroke
import android.widget.Toast
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.adelaide.mytask.ui.theme.MyTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTaskTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MyButton()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyTaskTheme {
        MyButton()
    }
}

@Composable
fun MyButton() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val context = LocalContext.current

        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Welcome to Geeks for Geeks",
                    Toast.LENGTH_LONG
                ).show()
            },
            modifier = Modifier.padding(16.dp),
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Red
            ),
            elevation =
                ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
            border = BorderStroke(width = 2.dp, brush = SolidColor(Color.Black)),

            contentPadding = PaddingValues(
                start = 50.dp,
                top = 50.dp,
                end = 50.dp,
                bottom = 50.dp
            ),
            interactionSource = remember {
                MutableInteractionSource()
            }
        ) {
            Text(
                text = "Geeks for Geeks",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Serif
            )
        }
    }
}





