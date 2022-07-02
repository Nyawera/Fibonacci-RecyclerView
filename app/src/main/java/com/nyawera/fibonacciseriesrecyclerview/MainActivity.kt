package com.nyawera.fibonacciseriesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import androidx.recyclerview.widget.LinearLayoutManager
import com.nyawera.fibonacciseriesrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()

//        setContentView(R.layout.activity_main)
//

    }
    fun displayNumbers(){
//
        var numberList=displayFabonacciNumbers(100)
        var numberAdapter = NumberRecyclerViewAdapter(numberList)
        binding.rvNumber.layoutManager = LinearLayoutManager(this)
        binding.rvNumber.adapter = numberAdapter
//
//        fun
//        var n = 100
//        var t1 = 0
//        var t2 = 0


        }
    fun displayFabonacciNumbers(size:Int):List<Int>{


        var numberList=ArrayList<Int>()
        var t1 = 0
        var t2 = 1
        var number=0
        while (number<=size){
            print(t1)
            var sum=t1+t2
            t1=t2
            t2=sum
            number++
            numberList+=sum

        }
        return numberList



    }
}