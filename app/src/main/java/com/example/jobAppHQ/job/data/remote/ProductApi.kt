package com.example.jobAppHQ.job.data.remote

import com.example.jobAppHQ.job.domain.model.Product
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {
    @GET("products")
    suspend fun getProducts(): List<Product>
}
interface ProductDetailApi {
    @GET("products/{productId}")
    suspend fun getProductDetails(@Path(value = "productId") productId: String): Product
}