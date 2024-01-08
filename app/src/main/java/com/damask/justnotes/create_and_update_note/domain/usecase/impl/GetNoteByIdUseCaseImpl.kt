package com.damask.justnotes.create_and_update_note.domain.usecase.impl

import com.damask.justnotes.core.domain.repository.LocalDataSourceRepository
import com.damask.justnotes.create_and_update_note.domain.usecase.GetNoteByIdUseCase
import javax.inject.Inject

class GetNoteByIdUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
): GetNoteByIdUseCase {

    override operator fun invoke(id: Int) =
        localDataSourceRepository.getNoteByIdFlow(id)
}