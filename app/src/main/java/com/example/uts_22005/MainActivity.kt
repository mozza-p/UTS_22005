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
import com.example.uts_22005.Activity2

class MainActivity2 : AppCompatActivity() {
    lateinit var edTitle: EditText
    lateinit var btn:Button
    lateinit var teksBatasUsia : String
    lateinit var teksYear : String
    lateinit var teksGenre: String
    lateinit var teksDuration: String
    lateinit var radiobuttonChecked: RadioButton
    lateinit var adult: RadioButton
    lateinit var kids: RadioButton
    lateinit var radioGroup: RadioGroup
    lateinit var checkBoxThriller: CheckBox
    lateinit var checkBoxRomance: CheckBox
    lateinit var checkBoxHorror: CheckBox
    lateinit var checkBoxComedy: CheckBox
    lateinit var checkBoxAction: CheckBox
    lateinit var checkBoxFantasy: CheckBox
    lateinit var spinnerYear: Spinner
    lateinit var spinnerDurHour: Spinner
    lateinit var spinnerDurMinute: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edTitle = findViewById(R.id.edtextTitle)
        btn = findViewById(R.id.btn)
        adult = findViewById(R.id.rdButtonAdult)
        kids = findViewById(R.id.rdButtonKids)
        radioGroup = findViewById(R.id.rdGroupBatasUsia)
        spinnerYear = findViewById(R.id.spinnerYear)
        spinnerDurHour = findViewById(R.id.spinnerHours)
        spinnerDurMinute = findViewById(R.id.spinnerMinutes)

        btn.setOnClickListener {
            val selectedUsia = radioGroup!!.checkedRadioButtonId
            radiobuttonChecked = findViewById(selectedUsia)
            teksBatasUsia = radiobuttonChecked.text.toString()
            teksDuration = spinnerDurHour.selectedItem.toString()
            teksYear = spinnerYear.selectedItem.toString()

            val moveIntent = Intent(this@MainActivity, Activity2::class.java)
            moveIntent.putExtra(Activity2.EXTRA_TITLE,  edTitle.text.toString())
            moveIntent.putExtra(Activity2.EXTRA_BATASUSIA, teksBatasUsia)
            moveIntent.putExtra(Activity2.EXTRA_DURATION, teksDuration)
            moveIntent.putExtra(Activity2.EXTRA_YEAR, teksYear)
            startActivity(moveIntent)
        }

    }






}