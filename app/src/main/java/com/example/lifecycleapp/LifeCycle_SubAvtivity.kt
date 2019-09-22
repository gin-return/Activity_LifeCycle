package com.example.lifecycleapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class LifeCycle_SubAvtivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ActivityLifeCycle","SubActivityのonCreate()：SubActivity表示前の初期化処理を行います")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle__sub_avtivity)
    }

    override fun onStart() {
        Log.i("ActivityLifeCycle","SubActivityのonStart()：SubActivity表示直前の処理を行います")
        super.onStart()
    }

    override fun onRestart() {
        Log.i("ActivityLifeCycle","SubActivityのonRestart()：onStop()で見えなくなったSubActivityが前面に表示されます")
        super.onRestart()
    }

    override fun onResume() {
        Log.i("ActivityLifeCycle","SubActivityのonResume()：SubActivityが前面に表示されます")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ActivityLifeCycle","SubActivityのonPause()：他のアクティビティを開始しようとしています、データの保存や処理の終了を行います")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ActivityLifeCycle","SubActivityのonStop()：SubActivityがユーザーから見えなくなりました。")
        super.onStop()

    }

    override fun onDestroy() {
        Log.i("ActivityLifeCycle","SubActivityのonDestroy()：SubActivityが破棄される直前の処理を行います")
        super.onDestroy()
    }

    fun buttonClick(view: View) {
        finish()
    }
}
