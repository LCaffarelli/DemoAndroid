package com.example.demoandroid.DemoNav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demoandroid.R

class DemoNavOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_nav_one)
    }

    fun onClickBouton(view: View) {
        //On prépare l'action pour ouvrir l'activité
        // on met this pour dire que c'est cette activité, et DemoNavTwoActivity::class.java pour preciser ce qu'il va renvoyer
        val intent = Intent (this,DemoNavTwoActivity::class.java )

        //Executer ce type d'action (pour ouvrir une activity ) à l'aide de startActiity
        //Ancienne manière de faire, aujourd'hui on utilise plus des fragments
        startActivity(intent)
    }
}