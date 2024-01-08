package com.damask.justnotes.create_and_update_note.domain.usecase

import com.damask.justnotes.core.domain.model.Note

interface AddNoteUseCase {
    suspend operator fun invoke(note: Note)
}