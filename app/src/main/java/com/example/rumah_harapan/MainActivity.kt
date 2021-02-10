package com.example.rumah_harapan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rumah_harapan.HomePackage.HomeActivity

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.login)

        btnLogin.setOnClickListener{
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
