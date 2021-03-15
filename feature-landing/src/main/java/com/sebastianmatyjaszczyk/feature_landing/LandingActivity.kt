package com.sebastianmatyjaszczyk.feature_landing

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.sebastianmatyjaszczyk.libcompose.theme.CoffeeshopTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class LandingActivity : AppCompatActivity() {

    private val viewModel: LandingViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeshopTheme {
                LandingMain(viewModel.appName)
            }
        }
    }
}

@Composable
fun LandingMain(title: String) {
    var selectedItem by rememberSaveable { mutableStateOf(0) }
    val items = listOf(
        Pair("Home", Icons.Default.Home),
        Pair("Search", Icons.Default.Search),
        Pair("Cart", Icons.Default.ShoppingCart)
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(title) }
            )
        },
        bottomBar = {
            BottomNavigation {
                items.forEachIndexed { index, item ->
                    BottomNavigationItem(
                        icon = {
                            Icon(item.second, contentDescription = item.first)
                        },
                        label = { Text(item.first) },
                        selected = index==selectedItem,
                        onClick = { selectedItem = index }
                    )
                }
            }
        },
        content = {}
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoffeeshopTheme {
        LandingMain("CoffeeShop")
    }
}