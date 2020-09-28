package com.winmin.recyclerass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.winmin.recyclerass.model.Item
import com.winmin.recyclerview.model.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flowerlist=ArrayList<Item>()
        flowerlist.add(Item("Daisy",32.0,R.drawable.daisy,"1Kg"))
        flowerlist.add(Item("Rose",32.0,R.drawable.daisy,"3kg"))

        var flowerAdapter=ItemAdapter(flowerlist)
        flowerRecycler.layoutManager=LinearLayoutManager(this)

        flowerRecycler.adapter=flowerAdapter
    }
}