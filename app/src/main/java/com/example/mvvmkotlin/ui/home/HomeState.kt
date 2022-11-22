package com.example.mvvmkotlin.ui.home

import com.example.mvvmkotlin.data.Result
import com.example.mvvmkotlin.domain.model.Characters

data class HomeState(
    val characters: List<Characters> = emptyList(),
    val showPreviews:Boolean = false,
    val showNext : Boolean = false,
    val isLoading: Boolean = false
)
