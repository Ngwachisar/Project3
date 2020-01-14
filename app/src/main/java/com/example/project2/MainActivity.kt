package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.project2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bidinng: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)]

        bidinng =DataBindingUtil.setContentView(this, R.layout.activity_main)

        bidinng.btnSubmit.setOnClickListener{
            var person:Person = Person(bidinng.edtName.text.toString(), bidinng.edtOccupation.text.toString())

            bidinng.person1 = person
        }

    }
}
