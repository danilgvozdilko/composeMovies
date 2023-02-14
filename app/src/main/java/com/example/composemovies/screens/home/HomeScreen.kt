package com.example.composemovies.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composemovies.model.Movie
import com.example.composemovies.model.getMovies
import com.example.composemovies.navigation.MovieScreen
import com.example.composemovies.widgets.MovieRow

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Transparent, elevation = 0.dp) {
            Text(text = "Movies")
        }
    }) {
        MainContent(navController)
    }


}

@Composable
fun MainContent(
    navController: NavController,
    listMovies: List<Movie> = getMovies()
) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(listMovies) {
                MovieRow(movie = it) { movie ->
                    navController.navigate(route = MovieScreen.DetailScreen.name + "/$movie")
                }
            }
        }

    }
}

