package com.bkcsdo.kotlintutorial

import android.content.Context
import android.widget.Toast

//First Extension with Activity then with Context, Context is super class of Activity so both activity and adapter can be accessed

fun Context.showToast(message: String, duration:Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this,message,duration).show()
}