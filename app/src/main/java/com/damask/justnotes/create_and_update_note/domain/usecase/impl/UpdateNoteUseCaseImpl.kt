package com.damask.justnotes.create_and_update_note.domain.usecase.impl

import com.damask.justnotes.core.domain.model.Note
import com.damask.justnotes.core.domain.repository.LocalDataSourceRepository
import com.damask.justnotes.create_and_update_note.domain.usecase.UpdateNoteUseCase
import javax.inject.Inject

class UpdateNoteUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
): UpdateNoteUseCase {

    override suspend operator fun invoke(note: Note) = localDataSourceRepository.updateNote(note)
}