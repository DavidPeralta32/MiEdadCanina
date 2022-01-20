package com.daviperalta.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.daviperalta.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity","Activity create")
        binding.btnCalcularAge.setOnClickListener {
            val sAge = binding.etAge.text.toString()
            if (sAge.isEmpty()){
                Toast.makeText(this,"Ingresar una edad",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                val nAge = sAge.toInt()
                val nResultado = nAge * 7
                binding.tvResultado.text = "Tu edad canina es de $nResultado años"
            }

        }
    }
}