package com.example.branchtestactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //나는 브런치2야 1이 오려면 이 주석 밑으로 와야해
        //나도 브런치2로 갈거야 근데 브런치1에는 있어야해!
    }
}