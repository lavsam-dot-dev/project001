package lavsam.dev.project001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.ok)
        button.setOnClickListener {
            val text = findViewById<TextView>(R.id.textView)
            text.text = "OK from Button"
        }
    }
}