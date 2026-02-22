package com.example.smartmart.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartmart.domain.Category
import com.example.smartmart.domain.CategoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(val categoryUseCase: CategoryUseCase) : ViewModel() {

    private val _mutableCategoryLiveData = MutableLiveData<List<Category>>()
    val categoryLiveData: LiveData<List<Category>> = _mutableCategoryLiveData

    fun loadCategories(){
        viewModelScope.launch {
            _mutableCategoryLiveData.value = categoryUseCase.getCategories()
            println("SURESH CATEGORY LIST SIZE ${_mutableCategoryLiveData.value?.size}")
        }
    }
}