package com.example.zhangmingzhe.designmode.kotlinstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.zhangmingzhe.designmode.R
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions
import kotlinx.android.synthetic.main.activity_kotlin_study.*

@ContainerOptions(cache = CacheImplementation.NO_CACHE)
class KotlinStudyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_study)
        test.text = "hello"
        test.setOnClickListener {
            //            val intent = Intent(this, BuilderActivity::class)

//            startActivity()
        }
    }
}
