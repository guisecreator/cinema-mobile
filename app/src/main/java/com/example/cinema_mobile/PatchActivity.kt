package com.example.cinema_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.SharedPreferences
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PatchActivity : AppCompatActivity() {
    lateinit var preff: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patch)

        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)

        val poster_res:RecyclerView=findViewById((R.id.recview1))
        poster_res.adapter = PosterAdapter(this, PosterList().list)
        val actor_res:RecyclerView=findViewById((R.id.recview2))
        actor_res.adapter = ActorAdapter(this, ActorList().list2)
    }

}