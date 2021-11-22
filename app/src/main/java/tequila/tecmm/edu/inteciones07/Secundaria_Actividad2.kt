package tequila.tecmm.edu.inteciones07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Secundaria_Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundaria_actividad2)

        val button2= findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            finish()
    }
}
  }