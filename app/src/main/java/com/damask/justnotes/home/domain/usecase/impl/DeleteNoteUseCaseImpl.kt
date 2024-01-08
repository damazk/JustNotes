package com.damask.justnotes.home.domain.usecase.impl

import com.damask.justnotes.core.domain.model.Note
import com.damask.justnotes.core.domain.repository.LocalDataSourceRepository
import com.damask.justnotes.home.domain.usecase.DeleteNoteUseCase
import javax.inject.Inject

class DeleteNoteUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
): DeleteNoteUseCase {

    override suspend operator fun invoke(note: Note) {
        localDataSourceRepository.deleteNote(note)
    }
}

