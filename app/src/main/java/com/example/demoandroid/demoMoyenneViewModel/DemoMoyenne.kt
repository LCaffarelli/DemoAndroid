package com.example.demoandroid.demoMoyenneViewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.demoandroid.R
import com.example.demoandroid.databinding.ActivityDemoMoyenneBinding

class DemoMoyenne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val maVue = DataBindingUtil.setContentView<ActivityDemoMoyenneBinding>(
            this,
            R.layout.activity_demo_moyenne
        )
//On fait en sorte qu'il n'y ait plus de code dans l'activité, et que tout passe avec le ViewModel
        val moyenneViewModel = MoyenneClassroomViewModel()

        //Il faut au moins le mettre une fois pour afficher la vue
        maVue.moyenneViewModel = moyenneViewModel

        //Quand il y a un changement de données (il ecoute l'evenement) dans le VM, ça va mettre a jour la vue grâce à .observe et va lancer le refreshUi
        moyenneViewModel.refreshUI.observe(this, Observer {

        //Met le viewModel dans la vue
        maVue.moyenneViewModel = moyenneViewModel
        })


    }

}
