package com.example.zhangmingzhe.designmode.buildermode

import android.app.FragmentManager
import android.app.FragmentTransaction

/**
 * Created by Zhang Mingzhe on 2017/12/4.
 * mail:1084904209@qq.com
 * Describe:Builder的具体实现类
 */
class CustomDialogBuilderImpl : CustomDialogBuilder {
    private var mCustomDialog = CustomDialogImpl()

    override fun setNoteText(note: String): CustomDialogBuilder {
        mCustomDialog.setNoteText(note)
        mCustomDialog.setStateToNote()
        return this
    }

    override fun setContentText(content: String): CustomDialogBuilder {
        mCustomDialog.setContentText(content)
        mCustomDialog.setStateToContent()
        return this
    }

    override fun create(transition: FragmentTransaction, tag: String) {
        mCustomDialog.show(transition, tag)
    }

    override fun create(manager: FragmentManager, tag: String) {
        mCustomDialog.show(manager, tag)
    }
}