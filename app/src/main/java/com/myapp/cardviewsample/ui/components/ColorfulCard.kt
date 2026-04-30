package com.myapp.cardviewsample.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.cardviewsample.model.ColorfulItem

@Composable
fun ColorfulCard(
    item: ColorfulItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        onClick = onClick,
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = item.backgroundColor),
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(160.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = item.icon, fontSize = 48.sp)
            }
            
            Spacer(modifier = Modifier.width(16.dp))
            
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = item.description,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color.White.copy(alpha = 0.8f)
                    )
                )
            }
        }
    }
}
