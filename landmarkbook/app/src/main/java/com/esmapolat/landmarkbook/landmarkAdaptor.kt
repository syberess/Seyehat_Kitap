package com.esmapolat.landmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esmapolat.landmarkbook.databinding.LayoutRowBinding

class landmarkAdaptor(val lanmarklist:ArrayList<Landmark>): RecyclerView.Adapter<landmarkAdaptor.LandmarkHolder>() {
    class LandmarkHolder(val binding:LayoutRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding=LayoutRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return lanmarklist.size

    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.reyclerViewTextView.text=lanmarklist.get(position).name
        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,Details::class.java)
            intent.putExtra("Landmark",lanmarklist.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}

