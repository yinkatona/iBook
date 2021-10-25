package com.example.adeyinka_ibook.fragments

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.adeyinka_ibook.R
import com.example.adeyinka_ibook.databinding.FragmentProceedSplashScreenBinding


class ProceedSplashScreenFragment : Fragment() {

    private var _binding: FragmentProceedSplashScreenBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
       _binding = FragmentProceedSplashScreenBinding.inflate(inflater,container,false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.proceedBtn.setOnClickListener {
            navCon.navigate(R.id.action_proceedSplashScreenFragment_to_onBoardingFragment)
        }

    }

}