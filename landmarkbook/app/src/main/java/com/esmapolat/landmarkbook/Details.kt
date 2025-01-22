package com.esmapolat.landmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.esmapolat.landmarkbook.databinding.ActivityDetailsBinding
import com.esmapolat.landmarkbook.databinding.ActivityMainBinding

class Details : AppCompatActivity() {
    private lateinit var binding:ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent=intent
        val selectedlandmark=intent.getSerializableExtra("Landmark")as Landmark

        binding.nameText.text=selectedlandmark.name
        binding.countryText.text=selectedlandmark.country
        binding.imageView.setImageResource(selectedlandmark.image)



    }
}