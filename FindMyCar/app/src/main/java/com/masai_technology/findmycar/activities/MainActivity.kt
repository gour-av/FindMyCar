package com.masai_technology.findmycar.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.masai_technology.findmycar.R
import com.masai_technology.findmycar.fragments.*


class MainActivity : AppCompatActivity() {
    var drawerLayout: DrawerLayout? = null
    var toggle: ActionBarDrawerToggle? = null
    var toolbar: Toolbar? = null
    var navigationView: NavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();

    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawer)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout?.addDrawerListener(toggle!!)
        toggle!!.syncState()
        navigationView = findViewById(R.id.nav_view)
        navigationView?.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            val id = item.itemId
            var fragment: Fragment? = null
            when (id) {
                R.id.menu_chronology -> {
                    fragment = ChronologyFragment()
                    loadFragment(fragment)
                }
                /*  R.id.menu_wooden -> {
                    fragment = WoodenFragment()
                    loadFragment(fragment)
                }*/
                R.id.menu_style -> {
                    fragment = StyleFragment()
                    loadFragment(fragment)
                }
                /*  R.id.menu_leather -> {
                    fragment = LeatherFragment()
                    loadFragment(fragment)
                }*/
                /*  R.id.menu_black -> {
                    fragment = BlackFragment()
                    loadFragment(fragment)
                }*/
                R.id.menu_game -> {
                    val intent = Intent(this@MainActivity, GameActivity::class.java);
                    startActivity(intent);
                }
                R.id.menu_remove -> {
                    fragment = RemoveAdsFragment()
                    loadFragment(fragment)
                }
                R.id.menu_settings -> {

                }
               /* R.id.menu_feet -> {
                    *//* fragment = FeetFragment()
                    loadFragment(fragment)*//*
                }*/
                R.id.menu_share -> {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Find My Car App")
                    val app_url =
                        "https://find-my-car.flycricket.io/privacy.html"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, app_url)
                    startActivity(Intent.createChooser(shareIntent, "Share via"))
                }
                R.id.menu_information -> {
                    fragment = InformationFragment()
                    loadFragment(fragment)

                }
                else -> return@OnNavigationItemSelectedListener true
            }
            true
        })

    }

    private fun loadFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragment).commit()
        drawerLayout!!.closeDrawer(GravityCompat.START)
        fragmentTransaction.addToBackStack(null)
    }

    override fun onStart() {
        super.onStart()
        val styleFragment = StyleFragment()
        supportFragmentManager.beginTransaction().add(R.id.frame, styleFragment, "StyleFragment").commit()
    }





}