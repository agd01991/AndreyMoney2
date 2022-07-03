package com.example.andreymoney2.data.remote.model

data class VaultModel(
    val disclaimer: String,
    val date: String,
    val timestamp: String,
    val base: String,
    val rates: Map<String, Double>
)
