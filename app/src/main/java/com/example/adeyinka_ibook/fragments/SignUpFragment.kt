package com.example.adeyinka_ibook.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.example.adeyinka_ibook.R
import com.example.adeyinka_ibook.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpBinding.inflate(inflater,container,false)
        navCon = androidx.navigation.fragment.NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.getStartedBtn.setOnClickListener{
            navCon.navigate(R.id.action_signUpFragment_to_proceedSplashScreenFragment)
        }
       binding.getStartedBtn.setOnClickListener{
           navCon.navigate(R.id.action_signUpFragment_to_signInFragment)
       }
    }

}