package com.example.httprequests

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState


    data class RecipeState(
        val isLoading: Boolean = true,
        val categories: List<Category> = emptyList(),
        val error: String? = null
    )

}