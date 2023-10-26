package com.pam.utspam

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.pam.utspam.LoginActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        // Membuat handler untuk menunda perpindahan ke halaman berikutnya
        Handler().postDelayed({
            // Intent untuk perpindahan ke halaman berikutnya
            val intent = Intent(this, LoginActivity::class.java) // Gantilah 'NextActivity' dengan nama activity yang sesuai

            // Menjalankan intent untuk berpindah ke halaman berikutnya
            startActivity(intent)

            // Mengakhiri SplashScreenActivity
            finish()
        }, 3000) // Delay selama 3000ms (3 detik)
    }
}