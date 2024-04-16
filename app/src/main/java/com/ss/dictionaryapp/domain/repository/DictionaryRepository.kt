package com.ss.dictionaryapp.domain.repository

import com.ss.dictionaryapp.domain.model.WordItem
import com.ss.dictionaryapp.util.Result
import kotlinx.coroutines.flow.Flow


interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}