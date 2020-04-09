package com.vvk.dinnerdecided

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodlist = arrayListOf("Sambhar + Rice","Idly Dosa","Plain Dosa","Masala Dosa","Rasam + Rice","Biryani")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selectbtn.setOnClickListener{
            val random = Random()
            val randomfood = random.nextInt(foodlist.count())
            selectedFoodTxt.text = foodlist[randomfood]

        }
        btn.setOnClickListener{
            val newfood = searchTxt.text.toString()
            foodlist.add(newfood)
            searchTxt.text.clear()
            println(foodlist)
        }
    }
}