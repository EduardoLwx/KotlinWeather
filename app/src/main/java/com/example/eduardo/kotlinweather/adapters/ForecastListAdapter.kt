package com.example.eduardo.kotlinweather.adapters

import android.support.v7.widget.AppCompatAutoCompleteTextView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by eduardo on 22/02/18.
 */
class ForecastListAdapter(private val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
       return ViewHolder(TextView(parent?.context))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
       holder?.textView?.text = items[position]
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}