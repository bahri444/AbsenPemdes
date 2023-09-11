package com.example.absenpemdesv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//    private lateinit var tvText: TextView
//    private lateinit var navigation: BottomNavigationView
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_navigation)
//        init()
//        navigationListener()
//    }
//    private fun init() {
//        tvText = findViewById(R.id.tv_text)
//        navigation = findViewById(R.id.navigation)
//    }
//    private fun navigationListener() {
//        navigation.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.absen_now -> {
//                    tvText.text = item.title
//                    return@setOnItemSelectedListener true
////                    setContentView(R.layout.absen_now)
//                }
//                R.id.navigation_absen_week -> {
//                    tvText.text = item.title
//                    return@setOnItemSelectedListener true
////                    setContentView(R.layout.history_absen)
//                }
//                R.id.navigation_location -> {
//                    tvText.text = item.title
//                    return@setOnItemSelectedListener true
////                    setContentView(R.layout.location)
//                }
//                R.id.navigation_logout -> {
//                    tvText.text = item.title
//                    return@setOnItemSelectedListener true
////                    setContentView(R.layout.logout)
//                }
//            }
//            true
//        }
//    }
}