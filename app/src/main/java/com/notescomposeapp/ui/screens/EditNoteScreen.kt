package com.notescomposeapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.notescomposeapp.R

@Preview
@Composable
fun ScreenNewNote() {
    val inputTitleValue = remember { mutableStateOf(TextFieldValue()) }
    val inputNoteValue = remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = inputTitleValue.value,
            onValueChange = {
                inputTitleValue.value = it
            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 22.sp
            ),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.hint_note_title),
                    fontSize = 22.sp
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Green,
                backgroundColor = Color.Transparent
            )
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = inputNoteValue.value,
            onValueChange = {
                inputNoteValue.value = it
            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 18.sp
            ),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.hint_note_text),
                    fontSize = 18.sp
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Green,
                backgroundColor = Color.Transparent
            )
        )
    }
}