package com.christiano.financeapp.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.christiano.financeapp.model.TransactionType

data class Transaction(
    val id: String,
    val title: String,
    val category: String,
    val date: String,
    val amount: Double,
    val type: TransactionType,
    val icon: ImageVector,
    val iconBgColor: Color,
    val iconColor: Color,
)