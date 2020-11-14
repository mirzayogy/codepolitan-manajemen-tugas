package com.mirzayogy.codepolitan_manajemen_tugas.views.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.mirzayogy.codepolitan_manajemen_tugas.R
import com.mirzayogy.codepolitan_manajemen_tugas.views.main.MainActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity<MainActivity>()
        },1200)
    }
}