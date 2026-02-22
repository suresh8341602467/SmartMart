package com.example.smartmart.data

import com.example.smartmart.domain.Category
import com.example.smartmart.domain.CategoryRepository
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(val categoryApi: CategoryApi) : CategoryRepository {
    override suspend fun getCategories(): List<Category> =
        categoryApi.getCategories().categories

}