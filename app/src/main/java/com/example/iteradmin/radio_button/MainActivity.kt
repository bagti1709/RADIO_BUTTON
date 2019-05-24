package com.example.iteradmin.radio_button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radio_group=findViewById<RadioGroup>(R.id.radio_group)

        radio_group.setOnCheckedChangeListener{
            group, checkedId ->
            when(checkedId) {
                R.id.first  ->{
                    Toast.makeText(applicationContext,"yes",Toast.LENGTH_LONG).show()
                }
                R.id.second  ->{
                    Toast.makeText(applicationContext,"no",Toast.LENGTH_LONG).show()
                }
                R.id.third  ->{
                    Toast.makeText(applicationContext,"no",Toast.LENGTH_LONG).show()
                }
                R.id.fourth  ->{
                    Toast.makeText(applicationContext,"no",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
