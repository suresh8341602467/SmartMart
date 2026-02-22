package com.example.smartmart.domain

import javax.inject.Inject

class CategoryUseCase @Inject constructor(private val repository: CategoryRepository) {
    suspend fun getCategories() =
        repository.getCategories()

}