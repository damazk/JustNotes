package com.damask.justnotes.home.domain.usecase.impl

import com.damask.justnotes.core.domain.repository.LocalDataSourceRepository
import com.damask.justnotes.home.domain.usecase.GetAllNotesUseCase
import javax.inject.Inject

class GetAllNotesUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
): GetAllNotesUseCase {

    override operator fun invoke() = localDataSourceRepository.getAllNotesFlow()
}