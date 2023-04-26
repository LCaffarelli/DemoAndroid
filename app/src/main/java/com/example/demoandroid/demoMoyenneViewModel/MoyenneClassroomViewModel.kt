package com.example.demoandroid.demoMoyenneViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoyenneClassroomViewModel : ViewModel() {
    //On va créer une variable moyenne qui va nous servir pour les fonctions

    var moyenne = 0.0f

    //LiveData car on peut changer/ecouter en temps réel les valeurs
    var refreshUI = MutableLiveData<Boolean>()

    //Ma saisie en temps réel dans l'editText
    var maSaisie = MutableLiveData<String>("")

    //On va forcer le rafraichissement de la page dès la modification d'une valeur
    fun forceRefreshUi() {
        //Il va notifier qu'il y a un changement, et va appeler l'observer
        //on rajoute donc .value car il est écoutable
        //on le met à true pour le forcer à rafraichir la page, et permet d'avoir un seul observe dans le model au lieu d'en un avoir un sur chaque fonction
        refreshUI.value = true
    }

    //On va créer la fonction pour calculer la moyenne lorsqu'on va cliquer sur le bouton
    fun calculerMoy() {
        //ici note en dure pour l'exemple , normalement on utilisera un formulaire
        val notes = mutableListOf<Float>(10.0f, 20.0f, 15.0f)

        moyenne = notes.average().toFloat()

        //on force le rafraichissement. Si on avait d'autre boutons, seule la valeur qui change est modifiée
        //mais l'autre reste affichée
        forceRefreshUi()

    }

    fun verifSaisie(){
        //.value car mutable
        println("ENI-DEMO : "+maSaisie.value)

        // !! pour dire que ça peut etre null
        if (maSaisie.value!!.isEmpty()){
            println("C'est vide")
        }else{
            println("c'est rempli")
        }
    }
}