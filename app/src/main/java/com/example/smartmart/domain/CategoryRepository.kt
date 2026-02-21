package com.example.smartmart.domain

interface CategoryRepository {

    suspend fun getCategories(): List<Category>
}