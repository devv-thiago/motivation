package br.com.devvthiago.motivationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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

    }
    override fun onClick(view: View) {
        if (view.id == R.id.button_newPhrase){
            var s = ""
            println(s)
        }
    }

}