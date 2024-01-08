package com.damask.justnotes.home.domain.usecase

import com.damask.justnotes.core.domain.model.Note

interface DeleteNoteUseCase {

    suspend operator fun invoke(note: Note)
}