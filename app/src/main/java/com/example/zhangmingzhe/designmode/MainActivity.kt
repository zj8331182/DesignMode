package com.example.zhangmingzhe.designmode

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.zhangmingzhe.designmode.buildermode.BuilderActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.builder_activity).setOnClickListener({
            startActivity(Intent(this, BuilderActivity::class.java))
        })
    }
}
