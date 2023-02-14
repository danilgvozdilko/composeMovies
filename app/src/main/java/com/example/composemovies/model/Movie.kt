package com.example.composemovies.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val rating: String,
    val images: List<String>,
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "tt0499549",
            title = "Avatar",
            year = "2009",
            rating = "7.9",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/bayzar-408f1.appspot.com/o/image%2FSubcategoryByDefault.png?alt=media&token=90a88b38-38bd-41c1-b095-f517ae6a46e7",
                "https://firebasestorage.googleapis.com/v0/b/bayzar-408f1.appspot.com/o/image%2FSubcategoryByDefault.png?alt=media&token=90a88b38-38bd-41c1-b095-f517ae6a46e7",
                "https://firebasestorage.googleapis.com/v0/b/bayzar-408f1.appspot.com/o/image%2FSubcategoryByDefault.png?alt=media&token=90a88b38-38bd-41c1-b095-f517ae6a46e7"
            )
        ),
        Movie(
            "tt0416449",
            title = "300",
            year = "2006",
            rating = "8.0",
            listOf("https://firebasestorage.googleapis.com/v0/b/bayzar-408f1.appspot.com/o/image%2FSubcategoryByDefault.png?alt=media&token=90a88b38-38bd-41c1-b095-f517ae6a46e7")
        )
    )
}