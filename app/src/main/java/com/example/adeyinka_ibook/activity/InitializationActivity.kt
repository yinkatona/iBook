package com.example.adeyinka_ibook.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.adeyinka_ibook.R
import com.example.adeyinka_ibook.databinding.ActivityMainBinding

class InitializationActivity : AppCompatActivity() {
    private lateinit var navCon : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash_screen)

        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navCon = navHost.navController
    }

    override fun onSupportNavigateUp(): Boolean{
        return navCon.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
    }

}