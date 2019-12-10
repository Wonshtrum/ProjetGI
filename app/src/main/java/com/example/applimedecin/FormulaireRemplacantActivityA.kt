package com.example.applimedecin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_formulaire_remplacant_a.*

class FormulaireRemplacantActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulaire_remplacant_a)
        boutonSuivantARemp.setOnClickListener {

            startActivity(Intent(this@FormulaireRemplacantActivityA,FormulaireRemplacantActivityB::class.java))
        }
    }

}