package com.example.zhangmingzhe.designmode.buildermode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.zhangmingzhe.designmode.R

class BuilderActivity : AppCompatActivity() {

    private lateinit var mContentButton: Button
    private lateinit var mNoteButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)
        mContentButton = findViewById(R.id.builder_activity_content_dialog_button)
        mNoteButton = findViewById(R.id.builder_activity_note_dialog_button)

        mContentButton.setOnClickListener({
            CustomDialogBuilderImpl()
                    .setNoteText("This is note : Are you sure close this dialog")
                    .setContentText("This is content : Hello world")
                    .create(fragmentManager, "Content")
        })

        mNoteButton.setOnClickListener({
            CustomDialogBuilderImpl()
                    .setContentText("This is content : Hello world")
                    .setNoteText("This is note : Are you sure close this dialog")
                    .create(fragmentManager, "Note")
        })
    }
}
