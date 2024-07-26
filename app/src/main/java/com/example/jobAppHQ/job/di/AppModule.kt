package com.example.jobAppHQ.job.di

import com.example.jobAppHQ.job.data.remote.ProductApi
import com.example.jobAppHQ.job.data.remote.ProductDetailApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideProductApi(): ProductApi {
        return Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductApi::class.java)

    }

    @Singleton
    @Provides
    fun provideProductDetailApi(): ProductDetailApi {
        return Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductDetailApi::class.java)

    }


}