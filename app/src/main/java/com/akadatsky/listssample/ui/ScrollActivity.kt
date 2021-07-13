package com.akadatsky.listssample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.akadatsky.listssample.R

class ScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        val content = findViewById<LinearLayout>(R.id.content)

        val view = LayoutInflater.from(this)
            .inflate(R.layout.list_item, content, false)

        view.findViewById<TextView>(R.id.title).text = "Some Title"
        view.findViewById<TextView>(R.id.subTitle).text = " asdf asdf asdf "

        content.addView(view, 1)

        val view2 = LayoutInflater.from(this)
            .inflate(R.layout.list_item, content, false)

        content.addView(view2, 3)

    }
}