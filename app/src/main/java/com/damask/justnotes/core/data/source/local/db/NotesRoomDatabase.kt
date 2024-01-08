package com.damask.justnotes.core.data.source.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.damask.justnotes.core.data.source.local.model.NoteEntity
import com.damask.justnotes.core.data.source.local.dao.NoteDao

@Database(entities = [NoteEntity::class], version = 1)
abstract class NotesRoomDatabase: RoomDatabase() {
    abstract fun noteDao() : NoteDao
}