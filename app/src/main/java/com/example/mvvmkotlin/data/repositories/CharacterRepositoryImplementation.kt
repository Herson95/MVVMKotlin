package com.example.mvvmkotlin.data.repositories

import com.example.mvvmkotlin.data.Result
import com.example.mvvmkotlin.data.source.remote.RickAndMortyApi
import com.example.mvvmkotlin.data.source.remote.dto.toCharacter
import com.example.mvvmkotlin.data.source.remote.dto.toListCharacters
import com.example.mvvmkotlin.domain.model.Character
import com.example.mvvmkotlin.domain.model.Characters
import com.example.mvvmkotlin.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CharacterRepositoryImplementation @Inject constructor(
    private val api: RickAndMortyApi
    ) : CharacterRepository{
    override fun getCharacters(page: Int): Flow<Result<List<Characters>>> = flow{
        emit(Result.Loading())
        try {
            val response = api.getCharacters(page).toListCharacters()
            emit(Result.Success(response))
        }catch (e: HttpException){
            emit(Result.Error(
                message = "Oops, something went wrong",
                data = null
            ))
        }catch (e: IOException){
            emit(Result.Error(
                message = "Couldn't reach server, please check your connection",
                data = null
            ))
        }
    }

    override suspend fun getCharacter(id: Int): Result<Character> {
        val response = try {
            api.getCharacter(id)
        }catch (e: Exception){
            return Result.Error(message = "An unknown error occurred")
        }

        return Result.Success(response.toCharacter())
    }
}