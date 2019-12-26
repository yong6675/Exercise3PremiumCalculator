package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calButton: Button = findViewById(R.id.buttonCalculate)
        calButton.setOnClickListener { premium() }

        val resetButton: Button = findViewById(R.id.buttonReset)
        resetButton.setOnClickListener{reset()}
    }

    private fun premium() {
        val spinner: Spinner = findViewById(R.id.spinnerAge)
        val radiobtn: RadioGroup = findViewById(R.id.radioGroupGender)
        val genderId: RadioButton = findViewById(radiobtn.checkedRadioButtonId)
        val checkbox: CheckBox = findViewById(R.id.checkBoxSmoker)
        val text1: TextView = findViewById(R.id.textViewPremium)

        if (spinner.selectedItem.equals("Less than 17"))
        {
            text1.setText("60")
        }else if(spinner.selectedItem.equals("17 to 25"))
        {
            if(genderId.text.equals("Male"))
            {
                if (checkbox.isChecked)
                {
                    text1.setText("70 + 50(extra for male) + 100(extra for smoker) = 230")
                }else
                {
                    text1.setText("70 + 50(extra for male) = 130")
                }
            }else if (checkbox.isChecked)
            {
                text1.setText("70 + 100(extra for smoker) = 170")
            }else
            {
                text1.setText("70")
            }

        }else if(spinner.selectedItem.equals("26 to 30"))
        {
            if(genderId.text.equals("Male"))
            {
                if (checkbox.isChecked)
                {
                    text1.setText("90 + 100(extra for male) + 150(extra for smoker) = 340")
                }else
                {
                    text1.setText("90 + 100(extra for male) = 190")
                }
            }else if (checkbox.isChecked)
            {
                text1.setText("90 + 150(extra for smoker) = 240")
            }else
            {
                text1.setText("90")
            }
        }else if(spinner.selectedItem.equals("31 to 40"))
        {
            if(genderId.text.equals("Male"))
            {
                if (checkbox.isChecked)
                {
                    text1.setText("120 + 150(extra for male) + 200(extra for smoker) = 470")
                }else
                {
                    text1.setText("120 + 150(extra for male) = 270")
                }
            }else if (checkbox.isChecked)
            {
                text1.setText("120 + 200(extra for smoker) = 220")
            }else
            {
                text1.setText("120")
            }
        }else if(spinner.selectedItem.equals("41 to 55"))
        {
            if(genderId.text.equals("Male"))
            {
                if (checkbox.isChecked)
                {
                    text1.setText("150 + 200(extra for male) + 250(extra for smoker) = 600")
                }else
                {
                    text1.setText("150 + 200(extra for male) = 350")
                }
            }else if (checkbox.isChecked)
            {
                text1.setText("150 + 250(extra for smoker) = 400")
            }else
            {
                text1.setText("150")
            }
        }else if(spinner.selectedItem.equals("More than 55"))
        {
            if(genderId.text.equals("Male"))
            {
                if (checkbox.isChecked)
                {
                    text1.setText("150 + 200(extra for male) + 300(extra for smoker) = 650")
                }else
                {
                    text1.setText("150 + 200(extra for male) = 350")
                }
            }else if (checkbox.isChecked)
            {
                text1.setText("150 + 300(extra for smoker) = 450")
            }else
            {
                text1.setText("150")
            }
        }
    }

    private fun reset() {
        val spinner: Spinner = findViewById(R.id.spinnerAge)
        val radiobtn: RadioGroup = findViewById(R.id.radioGroupGender)
        val checkbox: CheckBox = findViewById(R.id.checkBoxSmoker)
        val text1: TextView = findViewById(R.id.textViewPremium)

        spinner.setSelection(0)
        radiobtn.clearCheck()
        if(checkbox.isChecked)
        {
            checkbox.toggle()
        }
        text1.text = "Insurance Premium :"
    }
}
