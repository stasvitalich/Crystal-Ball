package com.example.crystallball
import render.animations.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crystallball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var prediction: String? = null
    var random = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pushButton()
    }

    private fun getRandomNumber() {
        random = (0 until Constants.predictions.size).random()
    }

    private fun getPrediction() {
        prediction = Constants.predictions[random]
    }

    private fun pushButton() = binding.apply {

        buttonPrediction.setOnClickListener {
            getRandomNumber()
            getPrediction()
            textPrediction.text = prediction
        }
    }


}