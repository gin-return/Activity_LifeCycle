package com.example.lifecycleapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ActivityLifeCycle","MainActivityのonCreate()：MainActivity表示前の初期化処理を行います")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.i("ActivityLifeCycle","MainActivityのonStart()：MainActivity表示直前の処理を行います")
        super.onStart()
    }

    override fun onRestart() {
        Log.i("ActivityLifeCycle","MainActivityのonRestart()：onStop()で見えなくなったMainActivityが前面に表示されます")
        super.onRestart()
    }

    override fun onResume() {
        Log.i("ActivityLifeCycle","MainActivityのonResume()：MainActivityが前面に表示されます")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ActivityLifeCycle","MainActivityのonPause()：他のアクティビティを開始しようとしています、データの保存や処理の終了を行います")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ActivityLifeCycle","MainActivityのonStop()：MainActivityがユーザーから見えなくなりました。")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("ActivityLifeCycle","MainActivityのonDestroy()：MainActivityが破棄される直前の処理を行います")
        super.onDestroy()
    }

    fun buttonClick(view: View) {
        val intent = Intent(applicationContext,LifeCycle_SubAvtivity::class.java)
        startActivity(intent)
    }


}