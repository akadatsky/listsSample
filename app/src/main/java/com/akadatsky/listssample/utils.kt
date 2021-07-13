package com.akadatsky.listssample

import android.content.Context
import android.graphics.Color
import android.widget.Toast
import kotlin.random.Random

fun Context.toast(message: CharSequence) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun randomColor(): Int =
    Color.argb(
        255,
        Random.nextInt(256),
        Random.nextInt(256),
        Random.nextInt(256)
    )