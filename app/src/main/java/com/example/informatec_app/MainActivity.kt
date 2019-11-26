package com.example.informatec_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtViewgo_to_register.setOnClickListener {
            Toast.makeText(this,"Soy un Toast",Toast.LENGTH_SHORT).show()
        }
    }
}
