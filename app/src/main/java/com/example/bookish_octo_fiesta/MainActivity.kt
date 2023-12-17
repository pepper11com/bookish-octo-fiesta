package com.example.bookish_octo_fiesta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bookish_octo_fiesta.ui.theme.BookishoctofiestaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var cheese = 1
        var chees2e = 1
        var cheese3 = 1
        setContent {
            BookishoctofiestaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(name = "Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier, name: String) {
    Text(
        text = "Hello ${name}!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BookishoctofiestaTheme {
        Greeting(name = "Android")
    }
}