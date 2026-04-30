package com.myapp.cardviewsample.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.myapp.cardviewsample.viewmodel.CardViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardListScreen(
    viewModel: CardViewModel,
    onItemClick: (Int) -> Unit
) {
    val items by viewModel.items.collectAsState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Colorful MVVM Cards",
                        fontWeight = FontWeight.ExtraBold,
                        style = MaterialTheme.typography.headlineMedium
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(items, key = { it.id }) { item ->
                ColorfulCard(
                    item = item,
                    onClick = { onItemClick(item.id) }
                )
            }
        }
    }
}
