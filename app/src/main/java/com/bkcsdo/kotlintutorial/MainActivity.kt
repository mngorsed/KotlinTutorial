package com.bkcsdo.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.d("MN","ApplicationContext button was clicked")
            //Toast.makeText(this@MainActivity,"button was clicked",Toast.LENGTH_SHORT).show()
            //Toast.makeText(this,"This button was clicked",Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext,"ApplicationContext button was clicked",Toast.LENGTH_SHORT).show()
        }
    }
}
