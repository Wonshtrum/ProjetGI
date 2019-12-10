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

class FormulaireAutreFActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulaire_autre_f)
        val editChamps2 = findViewById<View>(R.id.spinnerSecrétariat);
        val editSwitch = findViewById<Switch>(R.id.switchSecrétariat);
        boutonSuivantF.setOnClickListener {

            startActivity(Intent(this@FormulaireAutreFActivity,FormulaireAutreGActivity::class.java))
        }
        editSwitch.setOnCheckedChangeListener{ buttonView, isChecked ->
            println(isChecked)
            if (isChecked) {
                editChamps2.setEnabled(true)
            }else{
                editChamps2.setEnabled(false)
            }
        }
    }
}