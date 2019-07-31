package com.example.androidcore.navigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidcore.R
import kotlinx.android.synthetic.main.fragment_navigation_main.*

class NavigationMainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_navigation_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goToFirstFragmentBtn.setOnClickListener { view ->
            //Chiamo il controller e fornisco l'action
            findNavController().navigate(R.id.action_mainFragment_to_firstFragment);
        }

        //Se chiamo questo non va da nessuna parte e si spacca, perchè l'action per andare dal primo al secondo
        //fragment è proprietaria dal first fragment, non del main
        errorGoToSecondFragmentBtn.setOnClickListener { view ->
            //Chiamo il controller e fonrisco l'action
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment);
        }

    }


}
