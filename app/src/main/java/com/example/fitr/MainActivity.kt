package com.example.fitr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        bottomNavigation(R.id.bottomNavigationView, R.id.fragment)
    }
    private fun bottomNavigation(id: Int, location: Int) {
        val bottomNavigationView = findViewById<BottomNavigationView>(id)
        val navController = findNavController(location)

        bottomNavigationView.setupWithNavController(navController)
    }
}