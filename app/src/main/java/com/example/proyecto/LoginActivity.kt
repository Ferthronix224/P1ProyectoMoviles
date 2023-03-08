package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button = findViewById<Button>(R.id.btnLogin)
        val txtUser = findViewById<EditText>(R.id.txtUser)
        val txtPass = findViewById<EditText>(R.id.txtPass)
        button.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            val user = txtUser.text.trim().toString()
            val pass = txtPass.text.trim().toString()
            if(user.equals("isra") && pass.equals("1234")){
                startActivity(intent)
                finish()
            }




        }
    }
}