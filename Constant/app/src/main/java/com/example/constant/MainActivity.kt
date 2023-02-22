package com.example.constant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.constant.constans.Constans
import com.example.constant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button1.setOnClickListener {

            val name=bindingClass.editName.text.toString()
            when(name){

            Constans.DIRECTOR -> {

                bindingClass.textView1.visibility = View.VISIBLE
                val tempText = "получите ${Constans.DIRECTOR_SALARY}"

                bindingClass.textView1.text = if (bindingClass.password.text.toString() == Constans.DIRECTOR_PASSWORD){

                    tempText}
                else {
                     "неверный пароль"
                }
            }
                Constans.INGENER -> {
                    bindingClass.textView1.visibility = View.VISIBLE
                    val tempText = "получите ${Constans.INGENER_SALARY}"
                    bindingClass.textView1.text = if (bindingClass.password.text.toString() == Constans.INGINER_PASSWORD){

                        tempText}
                    else {
                        "неверный пароль"
                    }
                }

                Constans.DVORNIK -> {

                    bindingClass.textView1.visibility = View.VISIBLE

                    val tempText = "получите ${Constans.DVORNIK_SALARY}"

                    bindingClass.textView1.text = if (bindingClass.password.text.toString() == Constans.DVORNIK_PASSWORD){

                        tempText}
                    else {
                        "неверный пароль"
                    }

                }
                else -> {
                    bindingClass.textView1.visibility = View.VISIBLE
                    bindingClass.textView1.text = "нет такого работника"

                }
            }

            }
        }


    }

