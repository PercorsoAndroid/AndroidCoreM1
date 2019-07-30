package com.example.androidcore


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_navigation_first.*
import kotlinx.android.synthetic.main.fragment_navigation_main.*

class NavigationFirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_navigation_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        reallyGoToSecondFragmentBtn.setOnClickListener { view ->
            //Chiamo il controller e fonrisco l'action
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment);
        }
    }


}
