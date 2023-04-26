package com.example.chatveefirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var edtname:EditText
    private lateinit var btn_save:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtname = findViewById(R.id.edt_name)
        btn_save = findViewById(R.id.btnsave)

        var database = FirebaseDatabase.getInstance()
        var databaseRef = database.reference

        btn_save.setOnClickListener {
            databaseRef.setValue(user_data)
            var user_data = edtname.text.toString().trim()
            //Toast.makeText(this, , user_data, Toast.LENGTH_SHORT).show()
        }
    }
}