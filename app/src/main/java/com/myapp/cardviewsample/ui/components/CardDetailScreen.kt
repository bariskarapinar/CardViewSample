package com.myapp.cardviewsample.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.cardviewsample.viewmodel.CardViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardDetailScreen(
    itemId: Int,
    viewModel: CardViewModel,
    onBackClick: () -> Unit
) {
    val item = viewModel.getItemById(itemId) ?: return

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Details", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },
        containerColor = Color.Transparent
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(item.backgroundColor, item.backgroundColor.copy(alpha = 0.6f))
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .verticalScroll(rememberScrollState())
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Surface(
                    shape = RoundedCornerShape(32.dp),
                    color = Color.White.copy(alpha = 0.2f),
                    modifier = Modifier.size(200.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(text = item.icon, fontSize = 100.sp)
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = item.title,
                    style = MaterialTheme.typography.headlineLarge.copy(
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    ),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(16.dp))

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White.copy(alpha = 0.15f)
                    ),
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Text(
                            text = "Description",
                            style = MaterialTheme.typography.labelLarge.copy(
                                color = Color.White.copy(alpha = 0.6f),
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = item.description,
                            style = MaterialTheme.typography.bodyLarge.copy(
                                color = Color.White,
                                lineHeight = 28.sp
                            )
                        )
                        
                        Spacer(modifier = Modifier.height(24.dp))
                        
                        Text(
                            text = "Color Code",
                            style = MaterialTheme.typography.labelLarge.copy(
                                color = Color.White.copy(alpha = 0.6f),
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "#${Integer.toHexString(item.backgroundColor.value.toInt()).uppercase()}",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Monospace
                            )
                        )
                    }
                }
            }
        }
    }
}
