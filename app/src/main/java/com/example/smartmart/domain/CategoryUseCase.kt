package com.example.smartmart.domain

class CategoryUseCase(private val repository: CategoryRepository) {
    suspend fun getCategories() =
        repository.getCategories()

}