package com.damask.justnotes.home.di

import com.damask.justnotes.home.domain.usecase.DeleteNoteUseCase
import com.damask.justnotes.home.domain.usecase.GetAllNotesUseCase
import com.damask.justnotes.home.domain.usecase.impl.DeleteNoteUseCaseImpl
import com.damask.justnotes.home.domain.usecase.impl.GetAllNotesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeScreenModule {

    @Binds
    abstract fun bindDeleteNoteUseCase(
        deleteNoteUseCaseImpl: DeleteNoteUseCaseImpl
    ) : DeleteNoteUseCase

    @Binds
    abstract fun bindGetAllNotesUseCase(
        getAllNotesUseCaseImpl: GetAllNotesUseCaseImpl
    ) : GetAllNotesUseCase
}