package com.example.jobAppHQ.job.presentation.viewModels

import com.example.jobAppHQ.job.domain.model.Product


data class ProductScreenState(
    val isLoading : Boolean = false,
    val selectedCategory: String = "jewelery",
    val product: List<Product> = emptyList(),
    val error: String? = null
)

