package com.example.zhangmingzhe.designmode.statemode

import com.example.zhangmingzhe.designmode.buildermode.CustomDialogImpl

/**
 * Created by Zhang Mingzhe on 2017/12/4.
 * mail:1084904209@qq.com
 * Describe: Dialog在状态模式下Content模式实现
 */
class DialogContentState : DialogState {
    override fun onViewCreated(dialog: CustomDialogImpl) {
        dialog.setDialogToContent()
    }

    override fun clickBottomButton(dialog: CustomDialogImpl) {
        dialog.setStateToNote()
        dialog.setDialogToNote()
    }
}