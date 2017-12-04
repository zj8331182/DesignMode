package com.example.zhangmingzhe.designmode.buildermode

import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.zhangmingzhe.designmode.R
import com.example.zhangmingzhe.designmode.statemode.CustomDialogForStateMode
import com.example.zhangmingzhe.designmode.statemode.DialogContentState
import com.example.zhangmingzhe.designmode.statemode.DialogNoteState
import com.example.zhangmingzhe.designmode.statemode.DialogState

/**
 * Created by Zhang Mingzhe on 2017/12/4.
 * mail:1084904209@qq.com
 * Describe : Dialog的Product
 */
class CustomDialogImpl : DialogFragment(), CustomDialogForStateMode, CustomDialogForBuilderMode {

    private lateinit var mContentText: TextView
    private lateinit var mConfirmButton: Button
    private lateinit var mContentStr: String
    private lateinit var mNoteStr: String
    private lateinit var mState: DialogState

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.custom_dialog, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (view != null) {
            mContentText = view.findViewById(R.id.custom_dialog_content_text)
            mConfirmButton = view.findViewById(R.id.custom_dialog_confirm_button)
            mConfirmButton.setOnClickListener({ mState.clickBottomButton(this) })
            mState.onViewCreated(this)
        }
    }

    override fun setStateToNote() {
        mState = DialogNoteState()
    }

    override fun setStateToContent() {
        mState = DialogContentState()
    }

    override fun setContentText(content: String) {
        mContentStr = content
    }

    override fun setNoteText(note: String) {
        mNoteStr = note
    }

    override fun setDialogToNote() {
        isCancelable = false
        mContentText.text = mNoteStr
        mConfirmButton.text = resources.getString(R.string.custom_dialog_note_text)
    }

    override fun setDialogToContent() {
        isCancelable = true
        mContentText.text = mContentStr
        mConfirmButton.text = resources.getString(R.string.custom_dialog_confirm_text)
    }
}