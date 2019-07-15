package com.monte.a5dayschallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAboutAlc.setOnClickListener{

            val aboutIntent = Intent(this,AboutAlcActivity::class.java)
            startActivity(aboutIntent)
        }
        btnMyProfile.setOnClickListener{

            val myProfileIntent = Intent(this, MyProfileActivity::class.java)
            startActivity(myProfileIntent)
        }
    }
}
