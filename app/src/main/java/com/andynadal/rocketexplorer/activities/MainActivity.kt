package com.andynadal.rocketexplorer

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.andynadal.rocketexplorer.model.apolloClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenResumed {
            val response = apolloClient.query(HistoriesQuery()).execute()

            Log.d("--- Histories ---", "Success ${response.data}")
        }
    }
}