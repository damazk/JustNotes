package com.damask.justnotes.core.data.repository

import com.damask.justnotes.core.data.source.local.LocalDataSource
import com.damask.justnotes.core.domain.repository.LocalDataSourceRepository
import com.damask.justnotes.core.domain.model.Note
import javax.inject.Inject

class LocalDataSourceRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
): LocalDataSourceRepository {

    override fun getAllNotesFlow() = localDataSource.getAllNotesFlow()

    override fun getNoteByIdFlow(id: Int) = localDataSource.gelNoteByIdFlow(id)

    override suspend fun updateNote(note: Note) = localDataSource.updateNote(note)

    override suspend fun addNote(note: Note) = localDataSource.addNote(note)

    override suspend fun deleteNote(note: Note) = localDataSource.deleteNote(note)
}