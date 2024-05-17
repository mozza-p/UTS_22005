package com.example.intentlatihan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var edTitle: EditText
    lateinit var btn:Button
    lateinit var teksBatasUsia : String
    lateinit var teksGenre: String
    lateinit var radiobuttonChecked: RadioButton
    lateinit var adult: RadioButton
    lateinit var kids: RadioButton
    lateinit var radioGroup: RadioGroup
    lateinit var checkBoxChecked: CheckBox
    lateinit var
    lateinit var spinnerMenu: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edNama = findViewById(R.id.namaMenu)
        btn = findViewById(R.id.btn)
        dineIn = findViewById(R.id.dineIn)
        takeAway = findViewById(R.id.takeAway)
        spinnerMenu = findViewById(R.id.spinnerMenu)
        radioGroup = findViewById(R.id.bgroup)

        btn.setOnClickListener {
            //ambil teks dari RadioButton berdasarkan lingkup RadioGroup
            val selectedID = radioGroup!!.checkedRadioButtonId
            radiobuttonChecked = findViewById(selectedID)
            teksLayanan = radiobuttonChecked.text.toString()

            //ambil teks dari Spinner
            teksMenu = spinnerMenu.selectedItem.toString()

            val moveIntent = Intent(this@MainActivity2, MainActivity3::class.java)
            moveIntent.putExtra(MainActivity3.EXTRA_NAME,  edNama.text.toString())
            moveIntent.putExtra(MainActivity3.EXTRA_LAYANAN, teksLayanan)
            moveIntent.putExtra(MainActivity3.EXTRA_MENU, teksMenu)
            startActivity(moveIntent)
        }

    }






}