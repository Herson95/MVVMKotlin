package com.example.mvvmkotlin.domain.repositories

import com.example.mvvmkotlin.data.Result
import com.example.mvvmkotlin.domain.model.Characters
import com.example.mvvmkotlin.domain.model.Character
import kotlinx.coroutines.flow.Flow


interface CharacterRepository {
    fun getCharacters(page: Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id: Int): Result<Character>
}