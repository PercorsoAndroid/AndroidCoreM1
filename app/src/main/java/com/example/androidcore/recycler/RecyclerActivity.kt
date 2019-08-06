package com.example.androidcore.recycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.androidcore.R
import kotlinx.android.synthetic.main.activity_recycler.*
import java.util.*

class RecyclerActivity : AppCompatActivity() {

    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        viewManager = LinearLayoutManager(this)

        var items = mutableListOf("c#", "javascript", "java");

        viewAdapter = MyAdapter(items);

        my_recycler_view.apply {
            setHasFixedSize(true);
            layoutManager = viewManager;
            adapter = viewAdapter;
        }

        addItemBtn.setOnClickListener { view ->

            items.add("kotlin");

            viewAdapter.notifyDataSetChanged();

        }


    }
}
