package com.bestamibakir.recyclerviewtekrar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bestamibakir.recyclerviewtekrar.databinding.ActivityMainBinding
import com.bestamibakir.recyclerviewtekrar.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ornekSinifIntenti = intent.getSerializableExtra("ornekSinifİleAl") as OrnekSinif
        binding.textView.text = ornekSinifIntenti.isim
        binding.imageView.setImageResource(ornekSinifIntenti.gorsel)
    }
}