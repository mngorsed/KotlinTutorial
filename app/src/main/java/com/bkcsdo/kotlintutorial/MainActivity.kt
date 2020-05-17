package com.bkcsdo.kotlintutorial

import android.content.Intent
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

        //Explicit Intent
        btnSendMessage.setOnClickListener {
            Log.d("MN", "Second button was clicked")
            val message: String  = etUserMessage.text.toString()
            //Toast.makeText(this@MainActivity, message,Toast.LENGTH_SHORT).show()

            //This is Explicit intent : we know the target activity
            val intent = Intent(this,SecondActivity::class.java)

            intent.putExtra("user_message", message)

            startActivity(intent)
        }

        //Implicit Intent
        btnShareToOtherApps.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Please select app:"))
        }

        btnRecyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
        }
    }
}
