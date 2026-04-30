package com.myapp.cardviewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.myapp.cardviewsample.ui.navigation.AppNavigation
import com.myapp.cardviewsample.ui.theme.CardViewSampleTheme
import com.myapp.cardviewsample.viewmodel.CardViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: CardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardViewSampleTheme {
                AppNavigation(viewModel = viewModel)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardListPreview() {
    CardViewSampleTheme {
        AppNavigation(CardViewModel())
    }
}
