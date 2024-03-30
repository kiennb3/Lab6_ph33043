package com.kiendtph33043.myapplication

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    var context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btnGet = findViewById<Button>(R.id.btnGetdata)
        var tvKQ = findViewById<TextView>(R.id.tvKQ)
        val fn1 = VolleyFn1()
        btnGet!!.setOnClickListener {
            fn1.getAllData(context, tvKQ!!)
        }
    }
}