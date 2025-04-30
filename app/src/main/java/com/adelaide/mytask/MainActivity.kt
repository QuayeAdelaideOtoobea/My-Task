package com.adelaide.mytask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.TextField
import androidx.compose.runtime.internal.enableLiveLiterals
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.adelaide.mytask.ui.theme.MyTaskTheme
import java.nio.file.WatchEvent
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTaskTheme {
                Surface() {
                    LoginForm()
                }
            }
        }
    }
}


@Composable
fun LoginForm() {
    Column(
        modifier = Modifier
            .padding(100.dp)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "Welcome Back",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {}
        ) {
            Text(
                text = "Sign in with Google",
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Or, sign in with your email"
        )

        Spacer(modifier = Modifier.height(16.dp))


        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Email address") },
            placeholder = {
                Text(
                    text = "Enter your email address",

                )
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Password ") },
            placeholder = { Text("Enter your password") }
        )

        Spacer(modifier = Modifier.height(15.dp))


        Row {
            Text(
                text = "Keep me signed in", fontSize = 10.sp
            )
            Spacer(modifier = Modifier.width(15.dp))



            Text(
                text = "Forgot password",
                style = TextStyle(
                    fontSize = 12.sp,
                    textDecoration = TextDecoration.Underline
                )
            )


        }
        Button(
            onClick = {}
        ) {
            Text("Sign in")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        LoginForm()
    }
}



