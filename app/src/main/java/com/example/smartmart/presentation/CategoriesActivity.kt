package com.example.smartmart.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartmart.Constants
import com.example.smartmart.data.CategoryRepositoryImpl
import com.example.smartmart.domain.CategoryUseCase

class CategoriesActivity : AppCompatActivity() {

    private lateinit var viewModel: CategoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Create API
        val api = Constants.categoryApi

        //Create Repository
        val repository = CategoryRepositoryImpl(api)

        //Create UseCase
        val useCase = CategoryUseCase(repository)

        //Create ViewModel
        viewModel = CategoryViewModel(useCase)

        viewModel.loadCategories()
    }
}