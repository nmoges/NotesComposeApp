package com.notescomposeapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.notescomposeapp.model.Note


@Composable
fun NoteCard(note: Note, index: Int, onClick: (Int) -> Unit) {
    Card(
        backgroundColor = Color.White,
        modifier = Modifier
            .height(IntrinsicSize.Max)
            .fillMaxWidth()
            .padding(
                start = 10.dp,
                end = 10.dp
            )
            .clickable {
                onClick(index)
            }
    ) {
        Row {
            // Colored shape
            Box(
                modifier = Modifier
                    .width(5.dp)
                    .fillMaxHeight()
                    .clip(shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                    .background(Color.Red)
            )
            Column {
                // Title note
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 10.dp,
                            top = 5.dp,
                            end = 10.dp
                        ),
                    text = note.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                // Text note
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 10.dp,
                            top = 5.dp,
                            end = 10.dp,
                            bottom = 5.dp
                        ),
                    text = note.text,
                    fontSize = 14.sp
                )
                // Date
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 10.dp,
                            end = 10.dp,
                            bottom = 5.dp
                        ),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(text = note.lastUpdateDate ?: note.creationDate)
                }
            }
        }
    }
}

@Preview
@Composable
fun TestPreviewCardNote() {
    val note = Note(
        title = "Note 1",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id ornare ligula, in feugiat nunc. Mauris non est enim."
    )
    NoteCard(note = note, index = 0, onClick = { })
}