package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set title action bar and set color
        supportActionBar?.setTitle(Html.fromHtml("<font color=\"#000\">" + getString(R.string.app_name) + "</font>"))
    }
}