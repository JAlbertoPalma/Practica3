package mx.itson.edu.practicaa3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorProductos(var context: Context, var productos: ArrayList<Product>) : BaseAdapter() {

    override fun getCount(): Int {
        return productos.size
    }

    override fun getItem(p0: Int): Any {
        return productos[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var prod = productos[p0]
        var inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.producto_view, null)

        var imagen = vista.findViewById(R.id.producto_img) as ImageView
        var nombre = vista.findViewById(R.id.producto_nombre) as TextView
        var desc = vista.findViewById(R.id.producto_desc) as TextView
        var precio = vista.findViewById(R.id.producto_precio) as TextView

        imagen.setImageResource(prod.image)
        nombre.text = prod.name
        desc.text = prod.description
        // Agregamos el signo de dólar antes del precio
        precio.text = "$${prod.price}"

        return vista
    }
}