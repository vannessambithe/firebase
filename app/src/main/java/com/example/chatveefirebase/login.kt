package com.example.chatveefirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {

    private lateinit var edt_email:EditText
    private lateinit var edt_pass:EditText
    private lateinit var btn_login:Button
    private lateinit var btn_register:Button
    private lateinit var  auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_email = findViewById(R.id.edtemail)
        edt_pass = findViewById(R.id.edtpass)
        btn_login = findViewById(R.id.btnlogin)
        btn_register = findViewById(R.id.btnregister)
        auth = FirebaseAuth.getInstance()

        btn_login.setOnClickListener {
            var email = edt_email.toString().trim()
            var password = edt_pass.toString().trim()

        if(email.isEmpty()|| password.isEmpty()){
         t

        }

        btn_register.setOnClickListener {

        }

    }
}