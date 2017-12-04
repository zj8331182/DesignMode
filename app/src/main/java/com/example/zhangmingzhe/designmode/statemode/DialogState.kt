package com.example.zhangmingzhe.designmode.statemode

import com.example.zhangmingzhe.designmode.buildermode.CustomDialogImpl

/**
 * Created by Zhang Mingzhe on 2017/12/4.
 * mail:1084904209@qq.com
 * Describe : Dialog 状态的接口(分析界面有可能的行为)
 */
interface DialogState {
    fun clickBottomButton(dialog: CustomDialogImpl)
    fun onViewCreated(dialog: CustomDialogImpl)
}