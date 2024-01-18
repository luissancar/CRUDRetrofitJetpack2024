package com.example.crudretrofitjetpack2024

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
import com.example.crudretrofitjetpack2024.network.ProductService
import com.example.crudretrofitjetpack2024.ui.theme.CRUDRetrofitJetpack2024Theme
import com.example.crudretrofitjetpack2024.view.HomeScreen
import com.example.crudretrofitjetpack2024.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CRUDRetrofitJetpack2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel = HomeViewModel(ProductService.instance)
                    HomeScreen(viewModel)
                }
            }
        }
    }
}
