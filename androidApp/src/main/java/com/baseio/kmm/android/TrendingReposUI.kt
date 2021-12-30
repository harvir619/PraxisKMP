package com.baseio.kmm.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.baseio.kmm.android.ui.theme.BaseiOKMMTheme

class TrendingReposUI : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val viewModel = TrendingReposVM(application)
    setContent {
      BaseiOKMMTheme {
        val materialBlue700 = Color(0xFF1976D2)
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
          Scaffold(
            topBar = {
              TopAppBar(
                title = { Text("Trending Kotlin Repositories") },
                backgroundColor = materialBlue700
              )
            },
            content = {
                      TrendingReposListScreen(viewModel)
            },
          )
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  BaseiOKMMTheme {
    Greeting("Android")
  }
}