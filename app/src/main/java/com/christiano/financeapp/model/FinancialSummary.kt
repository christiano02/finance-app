package com.christiano.financeapp.model

data class FinancialSummary(
    val totalBalance: Double,
    val totalIncome: Double,
    val totalExpense: Double,
    val isBalanceVisible: Boolean = true
)