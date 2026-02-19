package mx.itson.edu.practicaa3

import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ProductosActivity : AppCompatActivity() {
    var menu = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        val menuType = intent.getStringExtra("menuType")
        val listView: ListView = findViewById(R.id.listViewProducts)
        val imageView: ImageView = findViewById(R.id.imageViewMenuType)

        agregarProductos(menuType)

        val adaptador = AdaptadorProductos(this, menu)
        listView.adapter = adaptador
    }

    private fun agregarProductos(menuType: String?) {
        when (menuType) {
            "Antojitos" -> {
                menu.add(Product("Quesadillas", R.drawable.taco, "Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad.", 5.99))
                menu.add(Product("Huaraches", R.drawable.taco, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans...", 10.99))
                menu.add(Product("Gringas", R.drawable.taco, "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
                menu.add(Product("Sincronizadas", R.drawable.taco, "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole...", 7.99))
                menu.add(Product("Sopes", R.drawable.taco, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema", 7.99))
                menu.add(Product("Tostadas", R.drawable.taco, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate", 8.99))
            }
            "Especialidades" -> {
                menu.add(Product("Mojarra Frita", R.drawable.taco, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas", 17.99))
            }
            "Combinations" -> {
            }
        }
    }
}