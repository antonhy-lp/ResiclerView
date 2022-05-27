package mx.edu.tecmm.moviles.resiclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler: RecyclerView

    companion object{
        val personas = ArrayList<Persona>()
    }

    fun abrirAgregar(v:View){
        val intent = Intent(this,AgregarPersona::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       recycler = findViewById(R.id.rvPersona)
    }

    override fun onPostResume() {
        super.onPostResume()
        actualizarRecycler()
    }
    fun actualizarRecycler(){
        val adaptador = Adaptador(this,personas)
        recycler.adapter = adaptador


    }
}