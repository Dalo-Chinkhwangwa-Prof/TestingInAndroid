package com.example.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            tex_edittext.text.let {

                if (it.toString().trim().isEmpty())
                    my_textview.text = getString(R.string.hello_world_text)
                else
                    my_textview.text = it.toString()
            }
        }
    }
}
