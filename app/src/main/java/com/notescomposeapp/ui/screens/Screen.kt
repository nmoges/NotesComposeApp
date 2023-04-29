package com.notescomposeapp.ui.screens

sealed class Screen(val route: String) {
    object ListNotesScreen : Screen("list_notes_screen")
    object EditNoteScreen : Screen("edit_note_screen")
}