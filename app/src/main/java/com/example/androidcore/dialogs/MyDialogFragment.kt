package com.example.androidcore.dialogs


import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.example.androidcore.R

class MyDialogFragment : DialogFragment() {

    /*override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dialog, container, false)
    }*/

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setMessage(R.string.dialog_fragment_message)
                .setPositiveButton(R.string.dialog_fragment_fire_option,
                    DialogInterface.OnClickListener { dialog, id ->
                        Toast.makeText(activity!!.applicationContext, R.string.dialog_fragment_missiles_fired, Toast.LENGTH_LONG).show();
                    })
                .setNegativeButton(R.string.dialog_fragment_cancel_option,
                    DialogInterface.OnClickListener { dialog, id ->
                        Toast.makeText(activity!!.applicationContext, R.string.dialog_fragment_operation_cancelled, Toast.LENGTH_LONG).show();
                    })
            // Create the AlertDialog object and return it
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
