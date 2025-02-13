package edu.msudenver.cs3013.simplebutton

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var flag = true
        val button = findViewById<Button>(R.id.pbutton)

        button.setOnClickListener {
            Toast.makeText(this,"You clicked Push Button.",Toast.LENGTH_SHORT).show()
            var text = findViewById<TextView>(R.id.pbtext)
            if( flag) {
                text.setBackgroundColor(Color.rgb(255, 255, 0))
                flag = false
            }
            else {
                text.setBackgroundColor(Color.rgb(255, 0, 0))
                flag = true
            }
        }



    }


}