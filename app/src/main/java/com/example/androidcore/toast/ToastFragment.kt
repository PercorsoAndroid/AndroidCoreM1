package com.example.androidcore.toast


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController

import com.example.androidcore.R
import kotlinx.android.synthetic.main.fragment_toast.*

class ToastFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_toast, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(this.context, resources.getString(R.string.toast_fragment_title), Toast.LENGTH_SHORT).show();

        toSnackbarFragmentBtn.setOnClickListener { view ->
            findNavController().navigate(R.id.action_toastFragment_to_snackbarFragment);
        }

    }


}
