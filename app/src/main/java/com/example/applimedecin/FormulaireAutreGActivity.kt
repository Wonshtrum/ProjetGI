package com.example.applimedecin

import android.os.Bundle
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_formulaire.*
import kotlinx.android.synthetic.main.activity_formulaire_autre_e.*
import kotlinx.android.synthetic.main.activity_formulaire_autre_f.*
import kotlinx.android.synthetic.main.activity_formulaire_autre_g.*

class FormulaireAutreGActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulaire_autre_g)
        val editChamps2 = findViewById<View>(R.id.spinnerSecrétariat);
        val editSwitch = findViewById<Switch>(R.id.switchSecrétariat);
        boutonSuivantG.setOnClickListener {

            startActivity(Intent(this@FormulaireAutreGActivity, MainActivity::class.java))
        }
    }
}