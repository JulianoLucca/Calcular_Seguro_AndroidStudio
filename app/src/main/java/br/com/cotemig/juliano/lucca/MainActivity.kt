package br.com.cotemig.juliano.lucca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btninicio = findViewById<Button>(R.id.btninicio)
        btninicio.setOnClickListener {
            var intent = Intent(this, ActivityLista::class.java)
            startActivity(intent)
        }
    }
}