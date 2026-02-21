package com.example.smartmart.data

import com.example.smartmart.Constants
import com.example.smartmart.Constants.CATEGORY_END_POINT
import com.example.smartmart.domain.Category
import com.example.smartmart.domain.CategoryWrapper
import retrofit2.http.GET

interface CategoryApi {

    @GET(CATEGORY_END_POINT)
    suspend fun getCategories(): CategoryWrapper
}