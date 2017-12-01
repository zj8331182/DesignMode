package com.example.zhangmingzhe.designmode.singlemode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.zhangmingzhe.designmode.R
import com.example.zhangmingzhe.designmode.SingletonApplication

class SingleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single)
        SingletonApplication.getInstance()
    }
}
