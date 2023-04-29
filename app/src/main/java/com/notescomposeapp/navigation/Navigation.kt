package com.notescomposeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.notescomposeapp.ScreenListNotes
import com.notescomposeapp.notes
import com.notescomposeapp.ui.screens.Screen

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.ListNotesScreen.route) {
        composable(route = Screen.ListNotesScreen.route) {
            it.destination.label = Screen.ListNotesScreen::class.java.simpleName
            ScreenListNotes(notes = notes)
        }

        composable(route = Screen.EditNoteScreen.route) {
            it.destination.label = Screen.EditNoteScreen::class.java.simpleName
        }
    }
}