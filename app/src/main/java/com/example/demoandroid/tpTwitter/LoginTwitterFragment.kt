package com.example.demoandroid.tpTwitter

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.demoandroid.R
import com.example.demoandroid.databinding.FragmentLoginTwitterBinding


/**
 * A simple [Fragment] subclass.
 * Use the [LoginTwitterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginTwitterFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        //Version plus actuelle car on utilise les fragments

        val maVue = DataBindingUtil.inflate<FragmentLoginTwitterBinding>(inflater,R.layout.fragment_login_twitter, container, false)

        //On instancie le VM
        val loginTwitterViewModel = TwitterLoginViewModel()

        maVue.loginTwitterViewModel= loginTwitterViewModel

        loginTwitterViewModel.refreshUI.observe(viewLifecycleOwner, Observer {
            //On met le VM dans la vue
            maVue.loginTwitterViewModel= loginTwitterViewModel
        })

        loginTwitterViewModel.loginSucces.observe(viewLifecycleOwner, Observer {

            // le it correspond à la valeur du loginSuccess
            //loginSuccess est par defaut sur false, on va ecouter s'il y a un changement, le it correspond à la valeur qui change donc
            // Si loginSuccess change à true là on pourra lancer la navigation
            if(it){
                findNavController().navigate(R.id.action_LoginTwitterFragment_to_ListTwitterFragment)
            }
        })

        //Quand on clique sur le bouton AVANT le viewmodel
//        binding.btnConnexion.setOnClickListener{
//
//        if(binding.editMail.text.isEmpty() || binding.editPassword.text.isEmpty()){
//            binding.tvFormMessage.text="Veuillez saisir tous les champs"
//            binding.tvFormMessage.setTextColor(Color.parseColor("#FF0000"))
//        }else{
//            binding.tvFormMessage.text="Saisies correctes"
//            //si tout est bon on lance la naviguation
//            findNavController().navigate(R.id.action_LoginTwitterFragment_to_ListTwitterFragment)
//        }
//    }

        return maVue.root
    }

}