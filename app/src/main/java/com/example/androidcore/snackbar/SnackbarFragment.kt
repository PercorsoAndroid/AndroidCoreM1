package com.example.androidcore.snackbar


import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.androidcore.R
import kotlinx.android.synthetic.main.fragment_snackbar.*

class SnackbarFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_snackbar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Snackbar.make(coordinatorLayout, resources.getString(R.string.hello_snackbar_fragment), Snackbar.LENGTH_SHORT).show();

    }


}
