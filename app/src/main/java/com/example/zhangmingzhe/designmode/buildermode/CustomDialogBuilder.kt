package com.example.zhangmingzhe.designmode.buildermode

import android.app.FragmentManager
import android.app.FragmentTransaction

/**
 * Created by Zhang Mingzhe on 2017/12/4.
 * mail:
 * Describe
 */
interface CustomDialogBuilder {
    fun setContentText(content: String): CustomDialogBuilder

    fun setNoteText(note: String): CustomDialogBuilder

    fun create(manager: FragmentManager, tag: String)

    fun create(transition: FragmentTransaction, tag: String)
}