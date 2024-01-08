package com.damask.justnotes.core.data.source.local

import com.damask.justnotes.core.data.mapper.toNote
import com.damask.justnotes.core.data.mapper.toNoteEntity
import com.damask.justnotes.core.domain.model.Note
import com.damask.justnotes.core.data.source.local.dao.NoteDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RoomLocalDataSource @Inject constructor(
    private val noteDao: NoteDao
) : LocalDataSource {

    override fun getAllNotesFlow(): Flow<List<Note>> {
        return noteDao.getAllNotes().map { noteEntityList ->
            noteEntityList.map { noteEntity -> noteEntity.toNote() }
        }
    }

    override suspend fun addNote(note: Note) {
        noteDao.insertNote(note.toNoteEntity())
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.delete(note.toNoteEntity())
    }

    override suspend fun updateNote(note: Note) {
        noteDao.updateNote(note.toNoteEntity())
    }

    override fun gelNoteByIdFlow(id: Int): Flow<Note> {
        return noteDao.getNoteById(id).map { noteEntity ->
            noteEntity.toNote()
        }
    }
}