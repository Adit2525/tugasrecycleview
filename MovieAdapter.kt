package com.example.latbaru.adapter

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.latbaru.MovieActivity
import com.example.latbaru.R
import com.example.latbaru.adapter.BukuAdapter.BukuAdapterHolder
import com.example.latbaru.model.ModelMovie

class MovieAdapter constructor(
    private val getActivity: MovieActivity,
    private val movieList: List<ModelMovie>

) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val txtMovie : TextView = itemView.findViewById(R.id.txtmovie)
        val imgMovie : ImageView = itemView.findViewById(R.id.imageView)
        val cardModelMovie : CardView = itemView.findViewById(R.id.cardMovie)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        holder.cardModelMovie.setOnClickListener(){
            Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_SHORT).show()
        }
    }

}
