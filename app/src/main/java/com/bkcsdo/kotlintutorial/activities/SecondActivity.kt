package com.bkcsdo.kotlintutorial.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bkcsdo.kotlintutorial.Constants
import com.bkcsdo.kotlintutorial.R
import com.bkcsdo.kotlintutorial.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    companion object {
        val TAG:String = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe call  ?.
        //Safe call with Let  ?.let{}
        //Not Null Assertion Operator ??

        //Extract intent data
        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString(Constants.USER_MSG_KEY)
            showToast(msg.toString())
            txvUserMessage.text = msg
        }
    }
}

