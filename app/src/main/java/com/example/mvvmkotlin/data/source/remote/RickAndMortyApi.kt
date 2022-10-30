package com.example.mvvmkotlin.data.source.remote

import com.example.mvvmkotlin.data.source.remote.dto.CharacterDTO
import com.example.mvvmkotlin.data.source.remote.dto.CharactersDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApi {

    @GET("character/")
    suspend fun getCharacters(
        @Query("page") page: Int
    ): CharactersDTO

    @GET("character/{id}")
    suspend fun getCharacter(
        @Query("id") id:Int
    ): CharacterDTO
}