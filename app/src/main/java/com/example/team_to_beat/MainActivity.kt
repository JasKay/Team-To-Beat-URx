package com.example.team_to_beat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
    val navController = findNavController(R.id.fragment)

    bottomNavigationView.

}