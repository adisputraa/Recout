package com.bangkit.recout.view.main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.recout.R

class MainActivity : AppCompatActivity() {
    //testing lagi
    //tes lagi
    //testing lagi
    //tes lagi
    //testing lagi
    //tes lagi
    //testing lagi
    //tes lagi
    //testing lagi
    //tes lagi
    //testing lagi
    //tes lagi
    //testing lagi
    //tes lagi//testing lagi
    //    //tes lagi
    //testing lagi
    //tes lagi


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}