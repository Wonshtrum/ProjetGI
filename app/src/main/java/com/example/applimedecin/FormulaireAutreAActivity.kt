package com.example.applimedecin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_formulaire.*
import kotlinx.android.synthetic.main.activity_formulaire_autre_a.*

class FormulaireAutreAActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulaire_autre_a)
        boutonSuivantA.setOnClickListener {

            startActivity(Intent(this@FormulaireAutreAActivity,FormulaireAutreBActivity::class.java))
        }
    }
}