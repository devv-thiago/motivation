package br.com.devvthiago.motivationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import br.com.devvthiago.motivationapp.databinding.ActivityMainBinding
import br.com.devvthiago.motivationapp.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonSave.setOnClickListener(this)

        supportActionBar?.hide()



    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save){
            handleSave()
        }
    }

    private fun handleSave(){
        val name = binding.editName.text.toString()
        if (name != " ") {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            Toast.makeText(this, "Digite um nome para prosseguir", Toast.LENGTH_SHORT).show()
        }
    }
}

