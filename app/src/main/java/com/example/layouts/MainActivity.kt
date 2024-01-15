package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*        val toolbar:Toolbar = findViewById(R.id.myToolbar)
        toolbar.title = "My toolbar"
        toolbar.inflateMenu(R.menu.my_menu)
        toolbar.setOnMenuItemClickListener { item ->
            when (item?.itemId) {
                R.id.call -> {
                    Toast.makeText(
                        this@MainActivity, "Calling...",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                else -> Unit
            }
            true
        }*/

    }
}