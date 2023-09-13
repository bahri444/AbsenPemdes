package com.example.absenpemdesv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
class Navigation : AppCompatActivity() {
    lateinit var loadBottomNavigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        loadFragment(AbsenNowFragment())
        loadBottomNavigation = findViewById(R.id.navigation_load) as BottomNavigationView
        loadBottomNavigation.setOnItemSelectedListener{ it
            when (it.itemId) {
                R.id.absen_now -> {
                    loadFragment(AbsenNowFragment())
                    true
                    return@setOnItemSelectedListener true //jika tombol navigasi di klik maka akan memiliki background
                }
                R.id.navigation_absen_week -> {
                    loadFragment(HistoryAbsenFragment())
                    true
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_location -> {
                    loadFragment(LocationFragment())
                    true
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_logout -> {
                    loadFragment(LogoutFragment())
                    true
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.bottom_navigation,fragment)
        transaction.commit()
    }
}