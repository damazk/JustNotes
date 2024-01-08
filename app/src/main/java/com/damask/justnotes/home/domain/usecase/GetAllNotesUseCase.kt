package com.damask.justnotes.home.domain.usecase

import com.damask.justnotes.core.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface GetAllNotesUseCase {

    operator fun invoke(): Flow<List<Note>>
}