package com.my.recycleviewassign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
    import com.google.android.gms.ads.MobileAds
import com.my.recycleviewassign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        displayNumberList()

    }

    fun displayNumberList(){
        val number = getFibonacciNumbers(100)
        binding.rvnumber.layoutManager = LinearLayoutManager(this)
        val numberAdapter = NumberRvAdapter( number )
        binding.rvnumber.adapter = numberAdapter


    }

}

fun getFibonacciNumbers(count: Int): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)

        for (i in 2 until count) {
            val nextNumber = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2]
            fibonacciNumbers.add(nextNumber)
        }

        return fibonacciNumbers

    }










