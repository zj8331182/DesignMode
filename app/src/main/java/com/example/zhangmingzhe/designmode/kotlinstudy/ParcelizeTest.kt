package com.example.zhangmingzhe.designmode.kotlinstudy

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Zhang Mingzhe on 2017/12/18.
 * mail:1084904209@qq.com
 * Describe
 */

@SuppressLint("ParcelCreator")
@Parcelize
class ParcelizeTest(val par_str: String, val par_int: Int) : Parcelable