package com.gs_chashkin.glidevsbasicresourse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MovieItemListAdapter() :
    RecyclerView.Adapter<MovieItemListAdapter.MovieItemListViewHolder>() {

    val data = mutableListOf<String>(
        "1"
    )

    class MovieItemListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemListAdapter.MovieItemListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item,
            parent,
            false
        )

        return MovieItemListViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieItemListViewHolder, position: Int) {


//        Glide.with(holder.itemView.context)
//            .load(R.drawable.avengers)
//            .into(holder.itemView.findViewById(R.id.film_image_item))

    }

    override fun getItemCount(): Int {
        return data.size
    }


}

