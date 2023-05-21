package com.example.cinema_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences
import androidx.recyclerview.widget.RecyclerView

class PatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patch)

        val poster_res:RecyclerView=findViewById((R.id.recview1))
        poster_res.adapter = PosterAdapter(this, PosterList().list)
        val actor_res:RecyclerView=findViewById((R.id.recview2))
        actor_res.adapter = ActorAdapter(this, ActorList().list2)
    }

}