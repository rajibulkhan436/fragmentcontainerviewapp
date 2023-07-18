package com.rajibul.fragmentcontainerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rajibul.fragmentcontainerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var a=10
    lateinit var binding: ActivityMainBinding
    var ClickInterface:ClickInterface?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPlus.setOnClickListener {
            a++
            ClickInterface?.ActivityClickPlus(a)
        }
        binding.btnMinus.setOnClickListener {
            a--
            ClickInterface?.ActivityClickMinus(a)
        }

    }



    fun ChangeText(text: String){
        binding.tvActivityText.setText(text)
    }
}



