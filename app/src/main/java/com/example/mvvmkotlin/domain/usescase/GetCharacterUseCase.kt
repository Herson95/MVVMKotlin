package com.example.mvvmkotlin.domain.usescase

import com.example.mvvmkotlin.domain.repositories.CharacterRepository
import com.example.mvvmkotlin.data.Result
import com.example.mvvmkotlin.domain.model.Character
import javax.inject.Inject

class GetCharacterUseCase  @Inject constructor(private val repository: CharacterRepository
) {
    suspend operator fun invoke(id:Int) : Result<Character>{
        return  repository.getCharacter(id)
    }
}