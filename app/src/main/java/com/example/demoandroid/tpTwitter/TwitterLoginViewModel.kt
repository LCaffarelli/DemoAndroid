package com.example.demoandroid.tpTwitter

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwitterLoginViewModel : ViewModel() {

    var refreshUI = MutableLiveData<Boolean>()

    //membre de classe qui va changer suivant les erreurs
    var errorMessage: String = ""

    var emailField = MutableLiveData<String>()
    var passwordField = MutableLiveData<String>()

    //Pour la couleur du message d'erreur ou de succés
    var colorMessage = Color.parseColor("#FF0000")

    //Pour savoir quand la connexion est valide
    var loginSucces = MutableLiveData<Boolean>(false)

    fun forceRefreshUi() {
        refreshUI.value = true
    }

    //Avec le isNullOrEmpty pas besoin des !! apres value
    fun validateLogin() {
        if (emailField.value.isNullOrEmpty() || passwordField.value.isNullOrEmpty()) {
            errorMessage = "Veuillez saisir tous les champs"

            //Pour annuler la connexion
            loginSucces.value = false
        } else {
            errorMessage = "Saisies correctes"

            //Exemple pour le changement de couleur mais sera inutile lorsqu'on mettra en place la navigation
            colorMessage = Color.parseColor("#00FF00")

            //Pour valider la connexion
            loginSucces.value = true

            //si tout est bon on lance la naviguation
            // findNavController().navigate(R.id.action_LoginTwitterFragment_to_ListTwitterFragment)
        }
        forceRefreshUi()
    }

}