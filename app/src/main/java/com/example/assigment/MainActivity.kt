package com.example.assigment
//import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   val btreg=findViewById<Button>(R.id.reg)

    btreg.setOnClickListener(this)

        }

    override fun onClick(p0: View?) {

        val intent= Intent(this,Register::class.java)
        startActivity(intent)
    }
    }
