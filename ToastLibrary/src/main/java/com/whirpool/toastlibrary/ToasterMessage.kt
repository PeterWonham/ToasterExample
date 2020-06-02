package com.whirpool.toastlibrary

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.toasttest.*

class ToasterMessage :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.toasttest)
        button.setOnClickListener { s(this,toast.toString()) }
    }
    fun s(c:Context,message:String){
        Toast.makeText(c,message,Toast.LENGTH_LONG).show()
    }
}