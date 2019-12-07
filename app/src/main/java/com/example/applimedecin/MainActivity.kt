package com.example.applimedecin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boutonConnexion.setOnClickListener {
            println("bonjour")
        }
        boutonInscription.setOnClickListener {
            setContentView(R.layout.activity_formulaire)
        }
    }
}
