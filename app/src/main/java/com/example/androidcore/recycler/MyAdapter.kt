package com.example.androidcore.recycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.androidcore.R
import kotlinx.android.synthetic.main.activity_recycler.view.*
import kotlinx.android.synthetic.main.recycler_list_item.view.*

class MyAdapter(private val myDataset: List<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val relativeLayout: RelativeLayout) : RecyclerView.ViewHolder(relativeLayout)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        // create a new view
        val relativeLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_list_item, parent, false) as RelativeLayout
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(relativeLayout)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.relativeLayout.singleItemBtn.text = myDataset[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}
