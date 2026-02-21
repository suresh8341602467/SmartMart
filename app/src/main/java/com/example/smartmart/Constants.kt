package com.example.smartmart

import com.example.smartmart.data.CategoryApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Constants {


    const val CATEGORY_START_POINT = "https://storage.googleapis.com/"
    const val CATEGORY_END_POINT = "smartmart/categories.json"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(CATEGORY_START_POINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val categoryApi: CategoryApi by lazy {
        retrofit.create(CategoryApi::class.java)
    }
}