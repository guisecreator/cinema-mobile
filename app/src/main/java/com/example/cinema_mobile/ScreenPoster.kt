package com.example.cinema_mobile

data class Poster(val imageId: Int, val title: String)
class PosterList {val list = arrayListOf(
    Poster(R.drawable.`klaus1`, ""),
    Poster(R.drawable.klaus2, ""),
    Poster(R.drawable.klaus3, ""),
    Poster(R.drawable.klaus4, ""),
    Poster(R.drawable.klaus5, ""))}