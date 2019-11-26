package com.example.informatec_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtViewgo_to_register.setOnClickListener {
            Toast.makeText(this,getString(R.string.please_fill_your_register_data),Toast.LENGTH_SHORT).show()

            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

        btn_ingresar.setOnClickListener {
            Toast.makeText(this,getString(R.string.Succefull_log),Toast.LENGTH_SHORT).show()
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
