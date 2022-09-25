package com.gauravbora.mvvmarchitecturetwowaydatabinding


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

import androidx.lifecycle.ViewModelProvider
import com.gauravbora.mvvmarchitecturetwowaydatabinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    private lateinit var viewModal: MyViewModal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModal= ViewModelProvider(this)[MyViewModal::class.java]

        binding.myViewModal=viewModal
        binding.lifecycleOwner=this

    }


}