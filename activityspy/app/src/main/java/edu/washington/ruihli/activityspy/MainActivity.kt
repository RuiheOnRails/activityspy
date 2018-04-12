package edu.washington.ruihli.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume event fired " + intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart event fired " + intent)
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart event fired " + intent)
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause event fired " + intent)
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop event fired " + intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy event fired " + intent)
        Log.e(TAG,"We’re going down, Captain!")
    }
}
