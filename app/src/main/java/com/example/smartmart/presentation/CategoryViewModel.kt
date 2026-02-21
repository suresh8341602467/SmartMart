package com.example.smartmart.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartmart.domain.Category
import com.example.smartmart.domain.CategoryUseCase
import kotlinx.coroutines.launch

class CategoryViewModel(val categoryUseCase: CategoryUseCase) : ViewModel() {

    private val _mutableCategoryLiveData = MutableLiveData<List<Category>>()
    val categoryLiveData: LiveData<List<Category>> = _mutableCategoryLiveData

    fun loadCategories(){
        viewModelScope.launch {
            _mutableCategoryLiveData.value = categoryUseCase.getCategories()
            println("SURESH CATEGORY LIST SIZE ${_mutableCategoryLiveData.value?.size}")
        }
    }
}