package com.example.dessertclicker.ui

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class ClickerUiState(
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    @DrawableRes val currentDessertImage: Int = dessertList[currentDessertIndex].imageId,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price
)
