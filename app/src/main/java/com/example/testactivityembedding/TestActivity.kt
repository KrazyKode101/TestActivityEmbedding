package com.example.testactivityembedding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        findViewById<Button>(R.id.close_test_activity).setOnClickListener {
            finish()
        }
    }
}