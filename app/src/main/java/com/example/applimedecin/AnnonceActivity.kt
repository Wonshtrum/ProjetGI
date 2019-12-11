package com.example.applimedecin

import android.os.Bundle
import android.text.Editable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.annonce_formulaire.*

class AnnonceActivity : AppCompatActivity(){
    private var sujet: Editable? = null
    private var contenu: Editable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.annonce_formulaire)
        validerAnnonceBouton.setOnClickListener{
            sujet = editSujet.text
            contenu = editText.text
            println(sujet)
        }
    }
}