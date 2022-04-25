package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

object ToastMsg {
    fun show(context : Context, message : String)
    {
        Toast.makeText(context,message, Toast.LENGTH_LONG).show()
    }
}