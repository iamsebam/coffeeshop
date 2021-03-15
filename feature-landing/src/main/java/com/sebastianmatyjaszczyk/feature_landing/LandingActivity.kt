package com.sebastianmatyjaszczyk.feature_landing

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sebastianmatyjaszczyk.libcompose.components.PrimaryTextView
import com.sebastianmatyjaszczyk.libcompose.theme.CoffeeshopTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class LandingActivity : AppCompatActivity() {

    private val viewModel: LandingViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeshopTheme {
                Surface(color = MaterialTheme.colors.background) {
                    GreetingView(viewModel)
                }
            }
        }
    }
}

@Composable
fun GreetingView(viewModel: LandingViewModel) {
    PrimaryTextView("Hello ${viewModel.appName()}!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoffeeshopTheme {
        PrimaryTextView("Hello coffeeshop!")
    }
}