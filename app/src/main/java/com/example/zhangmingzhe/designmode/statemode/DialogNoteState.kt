package com.example.zhangmingzhe.designmode.statemode

import com.example.zhangmingzhe.designmode.buildermode.CustomDialogImpl

/**
 * Created by Zhang Mingzhe on 2017/12/4.
 * mail:1084904209@qq.com
 * Describe:Dialog状态模式下Note状态实现
 */
class DialogNoteState : DialogState {
    override fun onViewCreated(dialog: CustomDialogImpl) {
        dialog.setDialogToNote()
    }

    override fun clickBottomButton(dialog: CustomDialogImpl) {
        dialog.dismiss()
    }
}