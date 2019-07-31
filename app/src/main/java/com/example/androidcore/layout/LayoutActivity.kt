package com.example.androidcore.layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.androidcore.R
import kotlinx.android.synthetic.main.relative_layout.*

class LayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout);

        button1.setOnClickListener { view ->
            container.setBackgroundColor(resources.getColor(R.color.colorAccent))
        }


        button2.setOnClickListener { view ->
            container.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
        }

        button3.setOnClickListener { view ->
            container.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }

    }
}
