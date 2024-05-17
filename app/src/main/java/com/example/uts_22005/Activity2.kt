package com.example.uts_22005

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_BATASUSIA = "extra_batasusia"
        const val EXTRA_DURATION= "extra_duration"
        const val EXTRA_YEAR= "extra_year"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textReceivedTitle: TextView = findViewById(R.id.receivedTitle)
        val textReceivedBatasUsia: TextView = findViewById(R.id.receivedBatasUsia)
        val textReceivedDuration: TextView = findViewById(R.id.receivedDuration)
        val textReceivedYear: TextView = findViewById(R.id.receivedYear)

        //simpan data String dari kiriman intent ke dalam variabel
        val title = intent.getStringExtra(EXTRA_TITLE)
        val batasusia = intent.getStringExtra(EXTRA_BATASUSIA)
        val durasi = intent.getStringExtra(EXTRA_DURATION)
        val year = intent.getStringExtra(EXTRA_YEAR)

        //mengganti teks pada TextView berdasarkan data yang dikirim dari activity 2
        textReceivedTitle.text = "Title: $title"
        textReceivedBatasUsia.text = "Watch for: $batasusia"
        textReceivedBatasUsia.text = "Watch for: $batasusia"
        textReceivedDuration.text = "Duration: $durasi"
    }
}