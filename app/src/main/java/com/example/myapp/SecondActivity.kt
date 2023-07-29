package com.example.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val appDev = findViewById<Button>(R.id.button1)
        val webDev = findViewById<Button>(R.id.button2)
        val iosDev = findViewById<Button>(R.id.button3)
        val aiBtn = findViewById<Button>(R.id.button4)
        val mlBtn = findViewById<Button>(R.id.button5)
        val blockchainBtn = findViewById<Button>(R.id.button6)
        val supportBtn = findViewById<Button>(R.id.supportBtn)

        appDev.setOnClickListener {
            intent = Intent(applicationContext, AppDevAct::class.java)
            startActivity(intent)
        }
        webDev.setOnClickListener {
            intent = Intent(applicationContext, webDevAct::class.java)
            startActivity(intent)
        }

        iosDev.setOnClickListener {
            intent = Intent(applicationContext, iosAppAct::class.java)
            startActivity(intent)
        }


        aiBtn.setOnClickListener {
            intent = Intent(applicationContext, aiAct::class.java)
            startActivity(intent)
        }
        mlBtn.setOnClickListener {
            intent = Intent(applicationContext, mlAct::class.java)
            startActivity(intent)
        }
        blockchainBtn.setOnClickListener {
            intent = Intent(applicationContext, blockchainAct::class.java)
            startActivity(intent)
        }
        supportBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.apply {
                data = Uri.parse("tel:999999999")
            }
            startActivity(intent)
        }


    }
}