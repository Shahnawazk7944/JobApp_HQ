package com.example.jobAppHQ.job.domain.repository

import arrow.core.Either
import com.example.jobAppHQ.jobApp.domain.model.NetworkError
import com.example.jobAppHQ.job.domain.model.Product

interface ProductsRepository {
    suspend fun getProduct():Either<NetworkError, List<Product>>

}
interface ProductDetailsRepository {
    suspend fun getProductDetails(productId: String):Either<NetworkError, Product>
}