package com.example.demoandroid.tpTwitter

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
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

        val binding = DataBindingUtil.inflate<FragmentLoginTwitterBinding>(inflater,R.layout.fragment_login_twitter, container, false)

        //Quand on clique sur le bouton
        binding.btnConnexion.setOnClickListener{

        if(binding.editMail.text.isEmpty() || binding.editPassword.text.isEmpty()){
            binding.tvFormMessage.text="Veuillez saisir tous les champs"
            binding.tvFormMessage.setTextColor(Color.parseColor("#FF0000"))
        }else{
            binding.tvFormMessage.text="Saisies correctes"
            //si tout est bon on lance la naviguation
            findNavController().navigate(R.id.action_LoginTwitterFragment_to_ListTwitterFragment)
        }
    }

        return binding.root
    }

}