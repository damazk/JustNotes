package com.damask.justnotes.create_and_update_note.domain.usecase

import com.damask.justnotes.core.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface GetNoteByIdUseCase {
    operator fun invoke(id: Int): Flow<Note>
}