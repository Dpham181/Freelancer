package edu.fullerton.cpsc411.gpagradingapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


val student = arrayOf(

    "danh pham"
)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, student)

        listview.adapter = adapter
        RE.setOnClickListener(){
            val intent = Intent(this, register::class.java)
            startActivity(intent)

        }
    }
}
