package com.notescomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.notescomposeapp.navigation.Navigation
import com.notescomposeapp.ui.appbar.DisplayTopAppBar
import com.notescomposeapp.ui.screens.ScreenListNotes
import com.notescomposeapp.ui.screens.notes
import com.notescomposeapp.ui.theme.NotesComposeAppTheme

class MainActivity : ComponentActivity() {
    
    private lateinit var navHostController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesComposeAppTheme {
                navHostController = rememberNavController()
                Scaffold(
                    topBar = { DisplayTopAppBar() },
                    content = { paddingValues ->
                        Column(
                            modifier = Modifier.padding(paddingValues)
                        ) {
                            Navigation(navHostController = navHostController)
                        }
                    }
                )
            }
        }
    }
}



@Preview
@Composable
fun TestDisplaySimpleListNotes() {
    ScreenListNotes(notes = notes)
}
