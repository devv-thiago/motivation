package br.com.devvthiago.motivationapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
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

        } else if (view.id in listOf(R.id.image_all, R.id.image_faces, R.id.image_sunny)) {
            handleFilter(view.id)
        }
    }

    private fun handleFilter(id: Int){

        when (id) {
            R.id.image_all -> {
                binding.imageAll.setColorFilter(ContextCompat.getColor(this,R.color.white))
            }
            R.id.image_faces -> {
                binding.imageFaces.setColorFilter(ContextCompat.getColor(this,R.color.white))
            }
            R.id.image_sunny -> {
                binding.imageSunny.setColorFilter(ContextCompat.getColor(this,R.color.white))
            }
        }
    }

}