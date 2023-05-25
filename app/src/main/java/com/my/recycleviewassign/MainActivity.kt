package com.my.recycleviewassign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.my.recycleviewassign.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        displayNumberList()
    }

    fun displayNumberList(){
        var number = listOf(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584)
        binding.rvnumber.layoutManager = LinearLayoutManager(this)
        val numberAdapter = NumberRvAdapter( number )
        binding.rvnumber.adapter = numberAdapter


    }
}









