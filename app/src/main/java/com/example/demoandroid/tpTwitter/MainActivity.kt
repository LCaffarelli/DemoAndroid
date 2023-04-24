package com.example.demoandroid.tpTwitter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import androidx.databinding.DataBindingUtil
import com.example.demoandroid.R
import com.example.demoandroid.databinding.ActivityMainBinding

//ATTENTION LES IMPORTS QUI NE SERVENT PLUS FONT BUGGER L'APPLICATION AU LANCEMENT ALORS LES SUPPRIMER!!!
class MainActivity : AppCompatActivity() {
    lateinit var amd: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amd = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //Notre code

        //Exercice 1 :
        var note1: Float = 10.0f
        var note2: Float = 15.5f
        var note3: Float = 12f
        var note4: Float = 8.5f
        var note5: Float = 18.5f
        var nbNote: Float = 5.0f
        var moyenne = (note1 + note2 + note3 + note4 + note5) / nbNote

        println("DemoAndroid " + moyenne)


        //Exercice 2
        var notesMath = mutableListOf<Float>(10f, 5.75f, 14f, 12f)
        var notesFrancais = mutableListOf<Float>(16f, 12.5f, 14f, 8f)
        var notesAnglais = mutableListOf<Float>(20f, 7.5f, 13.5f, 11f)
        var nbMatieres: Int = 3

        var moyenneMaths = notesMath.sum() / notesMath.size
        println("DemoAndroid " + moyenneMaths);

        var moyenneFrancais: Float = notesFrancais.sum() / notesFrancais.size
        println("DemoAndroid " + moyenneFrancais);

        //On est obligé de caster en toFloat car average attend des double. Mais est équivalent aux deux calculs du dessus
        var moyenneAnglais: Float = notesAnglais.average().toFloat()
        println("DemoAndroid " + moyenneAnglais);

        var moyenneGenerale = (moyenneMaths + moyenneFrancais + moyenneAnglais) / nbMatieres
        println("DemoAndroid " + moyenneGenerale);

        var moyenneSVT = calculMoyenne(4, 15f, 12f, 6f, 18f)
        println("DemoAndroid " + moyenneSVT)

        var mG = calculMoyenneGenerale(4, moyenneAnglais, moyenneFrancais, moyenneMaths, moyenneSVT)
        println("DemoAndroid " + mG)

        //

        //CORRECTION Partie 2

        //cf git chocolaterie


    }

    fun calculMoyenne(nbNotes: Int, note1: Float, note2: Float, note3: Float, note4: Float): Float {
        return (note1 + note2 + note3 + note4) / nbNotes

    }

    fun calculMoyenneGenerale(
        nbMatieres: Int,
        mat1: Float,
        mat2: Float,
        mat3: Float,
        mat4: Float
    ): Float {
        return (mat1 + mat2 + mat3 + mat4) / nbMatieres
    }

    //POUR TP TWITTER
    //écrit avec le DataBinding
//    fun onClickLogin(view: View) {
//
//
//        //Si on veut l'afficher avec un println il faut que l'on mette un toString car ce que l'on récupere n'est pas un string mais un Spannable.
//        //val emailText = edtMail.text.toString()
//
//        //empty va verifier s'il est null, s'il est vide, s'il y a des espaces. Mieux que isBlank
//        if (amd.editMail.text.isEmpty() || amd.editPassword.text.isEmpty()) {
//            amd.tvFormMessage.text = "Veuillez saisir tous les champs"
//            //Pour mettre le texte en rouge. On parse car il attend un int.
//            amd.tvFormMessage.setTextColor(Color.parseColor("#FF0000"))
//        } else {
//
//            amd.tvFormMessage.text = "Saisies correctes"
//        }
//
//
//    }
}