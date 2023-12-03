package com.mkrdeveloper.fragmentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout,firstFragment)
                .commit()
        }
    }
}