package com.zakariahossain.recyclerviewinkotlin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zakariahossain.recyclerviewinkotlin.R
import com.zakariahossain.recyclerviewinkotlin.adapters.HobbiesAdapter
import com.zakariahossain.recyclerviewinkotlin.interfaces.MyOnClickListener
import com.zakariahossain.recyclerviewinkotlin.models.HobbySupplier
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyOnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hobbyAdapter = HobbiesAdapter(this, HobbySupplier.hobbies)
        rcvHobbies.layoutManager = LinearLayoutManager(this)
        rcvHobbies.adapter = hobbyAdapter
        hobbyAdapter.setMyOnClickListener(this)
    }

    override fun myOnClick(position: Int) {
        startActivity(Intent(this, NewActivity::class.java).putExtra("hobby_name", HobbySupplier.hobbies[position].title).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION))
    }
}
