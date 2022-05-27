package mx.edu.tecmm.moviles.resiclerview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgregarPersona : AppCompatActivity() {
    lateinit var nombre : EditText
    lateinit var domicilio: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_persona)
        nombre = findViewById(R.id.txtnombre)
        domicilio=findViewById(R.id.txtdomicilio)

    }



    fun agregarDato(v:View){

       // val nombre = findViewById<TextView>(R.id.txtnombre)
        //val domicilio = findViewById<TextView>(R.id.txtdomicilio)

        val persona = Persona(nombre.text.toString(),domicilio.text.toString())

        MainActivity.personas.add(persona)
        Toast.makeText(this,"Se agrego una persona",Toast.LENGTH_LONG).show()
        finish()
    }
}