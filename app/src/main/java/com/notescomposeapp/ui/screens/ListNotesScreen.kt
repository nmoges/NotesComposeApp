package com.notescomposeapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.notescomposeapp.model.Note
import com.notescomposeapp.ui.views.NoteCard

@Composable
fun ScreenListNotes(notes: List<Note>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(5.dp))
        }
        items(notes) { note ->
            NoteCard(note = note, index = notes.indexOf(note), onClick = { })
        }
        item {
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

val notes = listOf<Note>(
    Note(
        title = "Note 1",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
    Note(
        title = "Note 2",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula"
    ),
    Note(
        title = "Note 3",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
    Note(
        title = "Note 4",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
    Note(
        title = "Note 5",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
    Note(
        title = "Note 6",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
    Note(
        title = "Note 7",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula"
    ),
    Note(
        title = "Note 8",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
    Note(
        title = "Note 9",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
    Note(
        title = "Note 10",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    ),
)