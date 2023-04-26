package com.example.chatveefirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth


class register : AppCompatActivity() {
    private lateinit var edt_name:EditText
    private lateinit var edt_email2:EditText
    private lateinit var edt_pass2:EditText
    private lateinit var btn_create:Button
    private lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edt_name = findViewById(R.id.edtname)
        edt_email2 = findViewById(R.id.edtemail2)
        edt_pass2 = findViewById(R.id.edtpass2)
        btn_create = findViewById(R.id.btncreate)
        auth = FirebaseAuth.getInstance()

        btn_create.setOnClickListener {
            var name = edt_name.text.toString().trim()
            var email = edt_email2.text.toString().trim()
            var password = edt_pass2.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "one of the fields is empty", Toast.LENGTH_SHORT).show()
            }


        }else {
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "user created successfully", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "failed to create account", Toast.LENGTH_SHORT).show()
                }
            }
    }
}}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

git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/vannessambithe/firebase.git
git push -u origin main