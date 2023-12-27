package com.example.intenttnhtng.tuan22

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.intenttnhtng.R

class Tuan211MainActKL : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan211_main_act_kl)
        txt1=findViewById(R.id.tuan211edt1)
        txt2=findViewById(R.id.tuan211edt2)
        btn1 = findViewById(R.id.tuan211btn1)

        btn1!!.setOnClickListener(View.OnClickListener {
            var i= Intent(this@Tuan211MainActKL,
                Tuan211SecondActKL::class.java)
                i.putExtra("so1", txt1!!.text.toString())
                i.putExtra("so2",txt2!!.text.toString())
                startActivity(i)
        })
    }
}