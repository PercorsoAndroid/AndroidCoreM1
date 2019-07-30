package com.example.androidcore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

class NavigationMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_main)

        //Aggiungiamo all'activity il grafo di navigazione
        val host = NavHostFragment.create(R.navigation.nav_graph)

        //Viene allacciato il fragment home, al quale faccio una transizione immediata
        supportFragmentManager.beginTransaction().replace(R.id.container, host).setPrimaryNavigationFragment(host).commit()
    }

    //Metodo a supporto della navigazione
    override fun onSupportNavigateUp(): Boolean = Navigation.findNavController(this, R.id.container).navigateUp()

}
