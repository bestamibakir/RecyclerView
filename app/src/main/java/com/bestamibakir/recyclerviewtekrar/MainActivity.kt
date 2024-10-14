package com.bestamibakir.recyclerviewtekrar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bestamibakir.recyclerviewtekrar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var ornekSinifListesi : ArrayList<OrnekSinif>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ornekSinif = OrnekSinif("isim1", R.drawable.hulk)
        val ornekSinif2 = OrnekSinif("isim2", R.drawable.ironman)

        ornekSinifListesi = arrayListOf(
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2,
            ornekSinif,
            ornekSinif2)

        val adapter = OrnekSinifAdapter(ornekSinifListesi)
        binding.exampleRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.exampleRecyclerView.adapter = adapter

    }
}