package com.example.smartmart.di

import com.example.smartmart.Constants.CATEGORY_START_POINT
import com.example.smartmart.data.CategoryApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    //used to create Retrofit instance
    @Provides
    @Singleton
    fun provideRetrofitApi(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(CATEGORY_START_POINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //used to create CategoryApi instance
    @Provides
    @Singleton
    fun provideCategoryApi(retrofit: Retrofit): CategoryApi {
        return retrofit.create(CategoryApi::class.java)
    }

}