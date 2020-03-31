package com.example.tema1.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tema1.R
import com.example.tema1.fragments.F1A1
import kotlinx.android.synthetic.main.fragment_f1_a1.*

class A1: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a1)

        btn_go_to_a2.setOnClickListener{
            goToA2()
        }

    }

    private fun goToA2(){
        val intent = Intent(this, A2::class.java)
        startActivity(intent)
    }

}