package com.zakariahossain.recyclerviewinkotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zakariahossain.recyclerviewinkotlin.R
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        supportActionBar?.title = "New Activity"
        tvHobbyName?.text = intent.getStringExtra("hobby_name")
    }
}
