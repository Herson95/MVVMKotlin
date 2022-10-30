package com.example.mvvmkotlin.domain.usescase

import com.example.mvvmkotlin.domain.model.Characters
import com.example.mvvmkotlin.domain.repositories.CharacterRepository
import com.example.mvvmkotlin.data.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator fun invoke(page: Int) : Flow<Result<List<Characters>>> {
        return repository.getCharacters(page)
    }
}