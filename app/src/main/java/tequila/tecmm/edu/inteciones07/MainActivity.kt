package tequila.tecmm.edu.inteciones07

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       val bntE= findViewById<Button>(R.id.btnExplicita)

        bntE.setOnClickListener {
            Log.e("Botton", "Se presiono ")
            val intent1= Intent(this, SecundariaActividad1::class.java)
            startActivity(intent1)


            val btnN=findViewById<Button>(R.id.btnNombre)
            btnN.setOnClickListener{
                Log.e("Botton","Se preciono")
                val intent2=Intent(this,Secundaria_Actividad2::class.java)
                startActivity(intent2)
            }


        }

        val bntI = findViewById<Button>(R.id.btnImplicita)

        bntI.setOnClickListener {
            Log.e("Botton","Se presiono Implicita")
            val aTiendad  = Intent(android.content.Intent.ACTION_VIEW)
            aTiendad.data= Uri.parse("http://google.com")
            startActivity(aTiendad)










        }
    }
}


