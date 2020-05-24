package com.bkcsdo.kotlintutorial.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.bkcsdo.kotlintutorial.Constants
import com.bkcsdo.kotlintutorial.R
import com.bkcsdo.kotlintutorial.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG:String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            Log.d(TAG,resources.getString(R.string.context_was_clicked))
            showToast(resources.getString(R.string.context_was_clicked),Toast.LENGTH_LONG)
        }
        //Explicit Intent
        btnSendMessage.setOnClickListener {
            Log.d(TAG, resources.getString(R.string.btn_second_button))
            val message: String  = etUserMessage.text.toString()
            //This is Explicit intent : we know the target activity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(intent)
        }
        //Implicit Intent
        btnShareToOtherApps.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,resources.getString(R.string.str_please_select_app)))
        }
        btnRecyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}

