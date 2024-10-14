package com.bestamibakir.recyclerviewtekrar

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.bestamibakir.recyclerviewtekrar.databinding.RecyclerRowBinding

class OrnekSinifAdapter(val ornekSinifListesi : ArrayList<OrnekSinif>) : RecyclerView.Adapter<OrnekSinifAdapter.OrnekSinifViewHolder>() {
    class OrnekSinifViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrnekSinifViewHolder {
        //RecyclerRowBinding ile RecyclerViewdaki her row için
        // onCreateViewHolder ile bir view oluşturmuş oluyoruz.
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return OrnekSinifViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ornekSinifListesi.size
    }

    override fun onBindViewHolder(holder: OrnekSinifViewHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = ornekSinifListesi[position].isim

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,SecondActivity::class.java)
            intent.putExtra("ornekSinifİleAl",ornekSinifListesi[position])
            holder.itemView.context.startActivity(intent)
        }
    }
}