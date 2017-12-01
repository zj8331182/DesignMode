package com.example.zhangmingzhe.designmode

import android.app.Application
import com.example.zhangmingzhe.designmode.singlemode.SingletonHolder

/**
 * Created by Zhang Mingzhe on 2017/12/1.
 * mail:1084904209@qq.com
 * Describe : 单例模式实践,好像Kotlin自带单例的方法Object关键字
 */
class SingletonApplication : Application() {

    companion object Instance {
        private val sApplicationHolder: SingletonHolder<SingletonApplication> = SingletonHolder()
        fun getInstance(): SingletonApplication {
            return sApplicationHolder.instance!!
        }
    }

    override fun onCreate() {
        sApplicationHolder.instance = this
        super.onCreate()
    }
}