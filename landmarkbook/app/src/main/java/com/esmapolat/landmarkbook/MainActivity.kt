package com.esmapolat.landmarkbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.esmapolat.landmarkbook.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarklist:ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        landmarklist = ArrayList<Landmark>()

        val pisa=Landmark("Pisa","İtaly",R.drawable.pisa)
        val colessum=Landmark("Colessum","İtaly",R.drawable.colessum)
        val eifel=Landmark("Eiffel","Fransa",R.drawable.eyfel)
        val londonbridge=Landmark("London Bridge","UK",R.drawable.londonbrige)
        landmarklist.add(pisa)
        landmarklist.add(colessum)
        landmarklist.add(eifel)
        landmarklist.add(londonbridge)

        /*
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = landmarkAdaptor(landmarklist)
        binding.javaClass.adapter = adapter
        */



        //list Vİew
        /*
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarklist.map{landmark -> landmark.name })
        binding.listView.adapter=adapter
        binding.listView.onItemClickListener=AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent=Intent(MainActivity@this,Details::class.java)
            intent.putExtra("Landmark",landmarklist.get(i))
            startActivity(intent)
        */


        }

}