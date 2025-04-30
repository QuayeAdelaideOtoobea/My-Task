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
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.adelaide.mytask.ui.theme.MyTaskTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTaskTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp), color = Color(0xFFEDE7F6)
                ) {
                    FeedbackForm()
                }
            }
        }
    }
}

@Composable
fun FeedbackForm() {

    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = "Feedback Form",

            modifier = Modifier,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6200EE),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(50.dp))


        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Name") },
            placeholder = { Text("Enter your name") })

        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Your Feedback") },
            placeholder = { Text("Enter your Feedback") })

        Spacer(modifier = Modifier.height(20.dp))


        Row(
            modifier = Modifier,
        ) {

            Text(
                text = "Subscribe to newsletter"
            )
            Spacer(modifier = Modifier.width(30.dp))


            Switch(
                checked = true, onCheckedChange = null
            )

        }

        Text("Rating:")

        Row() {
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)



            Row() {
                RadioButton(
                    selected = false, onClick = {})
                Text("Poor")
            }
            Row() {
                RadioButton(
                    selected = false, onClick = {})
                Text("Average")
            }
        }

        Row() {
            Row() {
                RadioButton(
                    selected = false, onClick = {})
                Text("Good")
            }

            Row() {
                RadioButton(
                    selected = false, onClick = {})
                Text("Excellent")
            }

        }

        Spacer(modifier = Modifier.height(16.dp))



        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = true,
                onCheckedChange = null
            )
            Text("I confirm my feedback is honest")
        }

        Spacer(modifier = Modifier.height(16.dp))


        Button(
            onClick = {}) {
            Text("Submit")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        FeedbackForm()
    }
}


