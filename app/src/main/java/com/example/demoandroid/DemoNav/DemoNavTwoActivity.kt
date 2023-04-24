package com.example.demoandroid.DemoNav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demoandroid.R

class DemoNavTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_nav_two)
    }

    //On va faire en sorte de faire boucler

    //Bouton pour relance une nouvelle activité
    fun onClickOneActivity(view: View) {
        //On prépare l'action pour ouvrir l'activité.
        // on met this pour dire que c'est cette activité, et DemoNavOne::class.java pour preciser ce qu'il va renvoyer.
        val intent = Intent (this,DemoNavOne::class.java )

        //Executer ce type d'action (pour ouvrir une activity ) à l'aide de startActiity
        //Ancienne manière de faire, aujourd'hui on utilise plus des fragments
        startActivity(intent)
    }

    //Bouton pour fermer toutes les activités en pile sauf la dernière
    fun onClickCloseAllToRoot(view: View) {
        //On prépare l'action pour tout fermer JUSQU'A l'activité par defaut.

        val intent = Intent (this,DemoNavOne::class.java )

        //Va permetre de tout supprimer et relancer une nouvelle activité
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        //Executer ce type d'action (pour ouvrir une activity ) à l'aide de startActiity
        //Ancienne manière de faire, aujourd'hui on utilise plus des fragments
        startActivity(intent)
    }
}