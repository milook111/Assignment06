package com.example.assignment06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

var onia = "onia"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(onia,"Collect!")
            startActivity(intent)
        }
        button2 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(onia,"Uncollect!")
            startActivity(intent)
        }
        button3 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(onia,"Uncollect!")
            startActivity(intent)
        }
        button4 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(onia,"Uncollect!")
            startActivity(intent)
        }
    }
}