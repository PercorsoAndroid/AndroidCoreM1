package com.example.androidcore.appbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.androidcore.R
import kotlinx.android.synthetic.main.activity_app_bar.*

class AppBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_bar)
        setSupportActionBar(my_toolbar);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appbar_menu, menu);
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem)= when (item.itemId){
        R.id.action_favorite -> {
            true;
        }

        R.id.action_settings -> {
            true;
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
