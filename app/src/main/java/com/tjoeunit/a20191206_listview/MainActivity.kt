package com.tjoeunit.a20191206_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    var noticeList = Array
    var noticeAdapter = Array

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNotices()

        noticeAdapter.adapter

    }

    fun addNotices(){
        noticeList.add

        noticeListView.setOnItemClickListener { parent, view, position}


    }

    var noticeData = noticeList.get(position)

    var intent = intent

}
