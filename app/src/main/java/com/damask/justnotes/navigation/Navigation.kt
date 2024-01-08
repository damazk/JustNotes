package com.damask.justnotes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.damask.justnotes.create_and_update_note.presentation.navigation.CreateAndUpdateNoteResArg
import com.damask.justnotes.home.presentation.navigation.HOME_SCREEN_ROUTE
import com.damask.justnotes.home.presentation.navigation.homeScreen
import com.damask.justnotes.home.presentation.navigation.navigateToHomeScreen
import com.damask.justnotes.create_and_update_note.presentation.navigation.navigateToCreateAndUpdateNote
import com.damask.justnotes.create_and_update_note.presentation.navigation.createAndUpdateNoteScreen

@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = HOME_SCREEN_ROUTE) {

        homeScreen(
            navigateToCreateNoteScreen = {
                navController.navigateToCreateAndUpdateNote(CreateAndUpdateNoteResArg.CREATE_NOTE,null)
            },
            navigateToUpdateNote = {
                navController.navigateToCreateAndUpdateNote(CreateAndUpdateNoteResArg.UPDATE_NOTE, it)
            }
        )

        createAndUpdateNoteScreen { navController.navigateToHomeScreen() }
    }
}