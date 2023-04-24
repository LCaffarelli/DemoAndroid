package com.example.demoandroid.demoNavFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.demoandroid.R
import com.example.demoandroid.databinding.FragmentOneBinding
//On peut supprimer tous les arguments les param et le companion autogénéré

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        //On va utiliser le dataBinding pour le bouton. C'est comme pour une activité mais comme c'est un fragment on va utiliser inflate au lieu de setContentView

        //Vue du fragmentOne en version dataBinding stockée dans une variable.
        // on met inflater au lieu de this dans les parametres, le xml associé
        // et le container de inflater
        val binding = DataBindingUtil.inflate<FragmentOneBinding>(inflater,R.layout.fragment_one, container, false )

        //on donne à binding la valeur du bouton et ce qui sera fait lorsqu'on clique sur le bouton
        binding.btnOpenFragmentTwo.setOnClickListener{
            //On appelle le singleton findNavController généré par le nav_graph et sa methode navigate qui va enclencher l'action de naviguer entre les deux fragments
            //c'est une action qui va en parenthese que l'on a generé dans le nav_graph et non le fragment cible
            findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        //On va retourner obligatoirement le root du binding , sinon on obtiendra une page blanche
        // cette variable binding a laquelle on rajoute .root car on est dans un fragment
        return binding.root
    }


}