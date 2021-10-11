package com.example.adeyinka_ibook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.adeyinka_ibook.R
import com.example.adeyinka_ibook.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentSignInBinding.inflate(inflater, container, false)
        navCon = androidx.navigation.fragment.NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.signInBtn.setOnClickListener{
            navCon.navigate(com.example.adeyinka_ibook.R.id.action_signInFragment_to_proceedSplashScreenFragment)
        }
        binding.signUpOption.setOnClickListener{
            navCon.navigate(R.id.action_signInFragment_to_signUpFragment)
        }

    }

}