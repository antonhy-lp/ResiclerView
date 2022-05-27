package mx.edu.tecmm.moviles.resiclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class Adaptador(context: Context,private var datos:List<Persona>) : RecyclerView.Adapter<Adaptador.ViewHolderPersona>() {

    class ViewHolderPersona(item: View) :RecyclerView.ViewHolder(item){
        var txtNombre : TextView = item.findViewById(R.id.txtNombre)
        var txtDomicilio : TextView = item.findViewById(R.id.txtDomicilio)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPersona {
        val layoutItem = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderPersona(layoutItem)
    }

    override fun onBindViewHolder(holder: ViewHolderPersona, position: Int) {
        val persona = datos[position]
        holder.txtNombre.text = persona.nombre
        holder.txtDomicilio.text = persona.domicilio
    }

    override fun getItemCount(): Int = datos.size

}