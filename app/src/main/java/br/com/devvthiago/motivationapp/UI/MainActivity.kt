package br.com.devvthiago.motivationapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.devvthiago.motivationapp.infrastructure.MotivationConstants
import br.com.devvthiago.motivationapp.R
import br.com.devvthiago.motivationapp.infrastructure.SecurityPreferences
import br.com.devvthiago.motivationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonNewPhrase.setOnClickListener(this)

        supportActionBar?.hide()
        val username = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textUsername.text = "Olá, $username"

    }
    override fun onClick(view: View) {
        if (view.id == R.id.button_newPhrase){

        }
    }

}