package com.akadatsky.listssample.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.akadatsky.listssample.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.scrollButton).setOnClickListener {
            startActivity(Intent(this, ScrollActivity::class.java))
        }

        findViewById<Button>(R.id.listButton).setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }

        findViewById<Button>(R.id.recyclerButton).setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }

    }
}