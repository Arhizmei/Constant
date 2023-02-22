package com.example.constant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.constant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button1.setOnClickListener {

            val name=bindingClass.editText1.text.toString()
            when(name){
            "andrey" -> {
                bindingClass.textView1.visibility = View.VISIBLE
                bindingClass.textView1.text = "получите 1000 грн"
            }
                "sergey" -> {
                    bindingClass.textView1.visibility = View.VISIBLE
                    bindingClass.textView1.text = "получите 1500 грн"
                }

                "evgeniy" -> {
                    bindingClass.textView1.visibility = View.VISIBLE
                    bindingClass.textView1.text = "получите 2500 грн"
                }
                else -> {
                    bindingClass.textView1.visibility = View.VISIBLE
                    bindingClass.textView1.text = "нет такого работника"

                }
            }

            }
        }
    }
