package com.example.jobAppHQ.job.di

import com.example.jobAppHQ.job.data.repository.ProductDetailsRepositoryImpl
import com.example.jobAppHQ.job.data.repository.ProductsRepositoryImpl
import com.example.jobAppHQ.job.domain.repository.ProductDetailsRepository
import com.example.jobAppHQ.job.domain.repository.ProductsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindProductRepository(impl: ProductsRepositoryImpl): ProductsRepository
    @Binds
    @Singleton
    abstract fun bindProductDetailsRepository(impl: ProductDetailsRepositoryImpl): ProductDetailsRepository
}