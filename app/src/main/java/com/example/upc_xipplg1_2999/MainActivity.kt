package com.example.upc_xipplg1_2999

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val terong = findViewById<ImageButton>(R.id.terong)
        val wortel = findViewById<ImageButton>(R.id.wortel)
        val selada = findViewById<ImageButton>(R.id.selada)
        val bawang = findViewById<ImageButton>(R.id.bawang)
        val cabai = findViewById<ImageButton>(R.id.cabai)
        val tomat = findViewById<ImageButton>(R.id.tomat)

        terong.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            wortel.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                selada.setOnClickListener {
                    val intent = Intent(this, MainActivity5::class.java)
                    startActivity(intent)
                    bawang.setOnClickListener {
                        val intent = Intent(this, MainActivity6::class.java)
                        startActivity(intent)
                        cabai.setOnClickListener {
                            val intent = Intent(this, MainActivity4::class.java)
                            startActivity(intent)
                            tomat.setOnClickListener {
                                val intent = Intent(this, MainActivity7::class.java)
                                startActivity(intent)
                            }
                        }
                    }
                }
            }
        }
    }
}