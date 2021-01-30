package com.sebastianmatyjaszczyk.coffeeshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import com.sebastianmatyjaszczyk.coffeeshop.ui.theme.CoffeeshopTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeshopTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", color = MaterialTheme.colors.primaryVariant)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoffeeshopTheme {
        Greeting("Android")
    }
}