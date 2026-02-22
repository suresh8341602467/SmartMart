package com.example.smartmart.di

import com.example.smartmart.data.CategoryRepositoryImpl
import com.example.smartmart.domain.CategoryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CategoryRepositoryModule {

    // binds CategoryRepositoryImpl to CategoryRepository
    @Binds
    @Singleton
    abstract fun bindCategoryRepository(impl: CategoryRepositoryImpl): CategoryRepository

}