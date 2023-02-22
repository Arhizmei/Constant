package com.example.constant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
            Log.d("my log", "ID = ${R.drawable.accesss}")
            bindingClass.imPhoto.visibility = View.VISIBLE
            val name=bindingClass.editName.text.toString()

            when(name){

            Constans.DIRECTOR -> {

                bindingClass.textView1.visibility = View.VISIBLE
                val tempText = "получите ${Constans.DIRECTOR_SALARY}"

                 if (bindingClass.password.text.toString() == Constans.DIRECTOR_PASSWORD){

                     bindingClass.textView1.text = tempText
                    bindingClass.imPhoto.setImageResource(R.drawable.andrey)
                }
                else {
                     bindingClass.textView1.text = "неверный пароль"
                     bindingClass.imPhoto.setImageResource(R.drawable.accesss)
                }
            }
                Constans.INGENER -> {

                    val tempText = "получите ${Constans.INGENER_SALARY}"
                                         if (bindingClass.password.text.toString() == Constans.INGINER_PASSWORD){

                         bindingClass.textView1.text =tempText
                         bindingClass.imPhoto.setImageResource(R.drawable.sergey)
                     }
                    else {
                         bindingClass.textView1.text = "неверный пароль"
                         bindingClass.imPhoto.setImageResource(R.drawable.accesss)
                    }
                }

                Constans.DVORNIK -> {

                    bindingClass.textView1.visibility = View.VISIBLE

                    val tempText = "получите ${Constans.DVORNIK_SALARY}"

                     if (bindingClass.password.text.toString() == Constans.DVORNIK_PASSWORD){

                         bindingClass.textView1.text = tempText
                         bindingClass.imPhoto.setImageResource(R.drawable.vadim)}
                    else {
                         bindingClass.textView1.text = "неверный пароль"
                         bindingClass.imPhoto.setImageResource(R.drawable.accesss)
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

