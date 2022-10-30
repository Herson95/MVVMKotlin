package com.example.mvvmkotlin.data.source.remote.dto

import com.example.mvvmkotlin.domain.model.Characters

data class CharactersDTO(
    val info: Info,
    val results: List<Result>
)

fun CharactersDTO.toListCharacters(): List<Characters>{

    val toListCharacters = results.mapIndexed{_,entries ->
        Characters(
            id = entries.id,
            name =  entries.name,
            specie = entries.species,
            image =  entries.image
        )
    }

    return  toListCharacters
}