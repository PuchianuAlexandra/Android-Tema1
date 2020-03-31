package com.example.tema1.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.tema1.R
import com.example.tema1.fragments.F1A2
import com.example.tema1.fragments.F2A2
import com.example.tema1.fragments.F3A2
import kotlinx.android.synthetic.main.activity_a2.*

class A2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a2)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fly_session, F1A2(), "first")
        fragmentTransaction.commit()

    }

    fun goToF2(view: View?) {
        val f2a2: Fragment = F2A2()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fly_session, f2a2)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun closeActivity(view: View?) {
        finish()
    }

    fun removeFragment(view: View?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = supportFragmentManager.findFragmentByTag("first")
        if (fragment != null) fragmentTransaction.remove(fragment)
        fragmentTransaction.commit()
        val toast = Toast.makeText(applicationContext, "Removed", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun goToF3(view: View?) {
        val f3a2: Fragment = F3A2()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fly_session, f3a2)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun onBackPressed() {
        finishAffinity()
        super.onBackPressed()
    }

}
