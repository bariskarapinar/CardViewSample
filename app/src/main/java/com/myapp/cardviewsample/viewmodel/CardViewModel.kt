package com.myapp.cardviewsample.viewmodel

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.myapp.cardviewsample.model.ColorfulItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CardViewModel : ViewModel() {

    private val _items = MutableStateFlow<List<ColorfulItem>>(emptyList())
    val items: StateFlow<List<ColorfulItem>> = _items.asStateFlow()

    init {
        loadItems()
        fun getItemById(id: Int): ColorfulItem? {
        return _items.value.find { it.id == id }
    }
}

    private fun loadItems() {
        _items.value = listOf(
            ColorfulItem(1, "Summer Vibe", "Golden sands and blue oceans.", Color(0xFFFFD700), "☀️"),
            ColorfulItem(2, "Forest Whisper", "Deep greens and earthy browns.", Color(0xFF2E7D32), "🌲"),
            ColorfulItem(3, "Ocean Breeze", "Cool blues and refreshing mist.", Color(0xFF0288D1), "🌊"),
            ColorfulItem(4, "Sunset Glow", "Warm oranges and purple skies.", Color(0xFFE64A19), "🌇"),
            ColorfulItem(5, "Midnight Magic", "Dark blues and twinkling stars.", Color(0xFF311B92), "✨"),
            ColorfulItem(6, "Berry Blast", "Sweet pinks and juicy reds.", Color(0xFFC2185B), "🍓"),
            ColorfulItem(7, "Lemon Zest", "Bright yellows and citrus energy.", Color(0xFFFBC02D), "🍋"),
            ColorfulItem(8, "Lavender Dream", "Soft purples and calm feelings.", Color(0xFF9575CD), "🪻")
        )
        fun getItemById(id: Int): ColorfulItem? {
        return _items.value.find { it.id == id }
    }
}
    fun getItemById(id: Int): ColorfulItem? {
        return _items.value.find { it.id == id }
    }
}
