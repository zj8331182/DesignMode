package com.example.zhangmingzhe.designmode.statemode

/**
 * Created by Zhang Mingzhe on 2017/12/4.
 * mail:1084904209@qq.com
 * Describe : State模式Context接口
 */
interface CustomDialogForStateMode {
    fun setStateToContent()

    fun setStateToNote()

    fun setDialogToContent()

    fun setDialogToNote()
}