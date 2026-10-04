package com.christiano.financeapp.model

import androidx.compose.ui.graphics.Color

data class BankCard(
    val id: String,
    val type: String,
    val numberLast4: String,
    val expiry: String,
    val bgColor: Color
)