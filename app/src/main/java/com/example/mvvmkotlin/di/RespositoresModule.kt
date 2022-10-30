package com.example.mvvmkotlin.di

import com.example.mvvmkotlin.data.repositories.CharacterRepositoryImplementation
import com.example.mvvmkotlin.domain.repositories.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RespositoresModule {

    @Binds
    abstract fun characterRepository(implementation: CharacterRepositoryImplementation):CharacterRepository
}