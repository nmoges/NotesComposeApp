package com.notescomposeapp.ui.screens

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.notescomposeapp.ui.theme.ColorTest2

@Preview
@Composable
fun DisplayTopAppBar() {
    TopAppBar(
        title = { },
        backgroundColor = ColorTest2,
        actions = {
            DefineTopAppBarActions()
        }
    )

}

@Preview
@Composable
fun DefineTopAppBarActions() {
    IconButton(
        onClick = {

        }
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            tint = Color.White,
            contentDescription = ""
        )
    }
    IconButton(
        onClick = {
        }
    ) {
        Icon(
            imageVector = Icons.Default.Settings,
            tint = Color.White,
            contentDescription = ""
        )
    }
}