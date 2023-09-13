package com.example.absenpemdesv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    //deklarasi variable
    private lateinit var click_button_login: Button
    private lateinit var click_button_register: Button
    private lateinit var click_botton_navigasi: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // code untuk tombol login pada view main activity
        click_button_login = findViewById(R.id.buttonlogin)
        click_button_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // code untuk tombol register pada view main activity
        click_button_register = findViewById(R.id.buttonregister)
        click_button_register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // code untuk tombol navigasi pada view main activity
        click_botton_navigasi = findViewById(R.id.gotonavigasi)
        click_botton_navigasi.setOnClickListener {
            val intent = Intent(this, Navigation::class.java)
            startActivity(intent)
        }

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