package com.ss.dictionaryapp.data.mapper

import com.ss.dictionaryapp.data.dto.DefinitionDto
import com.ss.dictionaryapp.data.dto.MeaningDto
import com.ss.dictionaryapp.data.dto.WordItemDto
import com.ss.dictionaryapp.domain.model.Definition
import com.ss.dictionaryapp.domain.model.Meaning
import com.ss.dictionaryapp.domain.model.WordItem


fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)