package com.damask.justnotes.core.data.mapper

import com.damask.justnotes.core.data.source.local.model.NoteEntity
import com.damask.justnotes.core.domain.model.Note

fun NoteEntity.toNote() = Note(id, title, description)

fun Note.toNoteEntity() = NoteEntity(id, title, description)