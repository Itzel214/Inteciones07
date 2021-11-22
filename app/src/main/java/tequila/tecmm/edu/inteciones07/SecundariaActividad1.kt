package tequila.tecmm.edu.inteciones07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecundariaActividad1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundaria_actividad)

        val btn3= findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            finish()
        }
    }

}