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
        var inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.producto_view, null)

        var imagen = vista.findViewById<ImageView>(R.id.producto_img)
        var nombre = vista.findViewById<TextView>(R.id.producto_nombre)
        var desc = vista.findViewById<TextView>(R.id.producto_desc)
        var precio = vista.findViewById<TextView>(R.id.producto_precio)

        var producto = productos[p0]

        imagen.setImageResource(producto.image)
        nombre.text = producto.name
        desc.text = producto.description
        precio.text = "$${producto.price}"

        return vista
    }
}