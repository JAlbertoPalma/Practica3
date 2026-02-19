package mx.itson.edu.practicaa3

import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ProductosActivity : AppCompatActivity() {

    var menu: ArrayList<Product> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        val menuType = intent.getStringExtra("menuType")
        val imageBanner: ImageView = findViewById(R.id.imageViewMenuType)

        cargarMenu(menuType, imageBanner)

        val listView: ListView = findViewById(R.id.listViewProducts)
        val adaptador = AdaptadorProductos(this, menu)
        listView.adapter = adaptador
    }

    private fun cargarMenu(type: String?, imageBanner: ImageView) {
        when (type) {
            "Antojitos" -> {
                imageBanner.setImageResource(R.drawable.antojitos)
                menu.add(Product("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad.", 5.99))
                menu.add(Product("Huaraches", R.drawable.huaraches, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.", 10.99))
                menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
                menu.add(Product("Sincronizadas", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two flour tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", 7.99))
                menu.add(Product("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.", 3.50))
                menu.add(Product("Tostadas", R.drawable.tostadas, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried flat tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.", 3.99))
            }
            "Especialidades" -> {
                imageBanner.setImageResource(R.drawable.especialidades)
                menu.add(Product("Mojarra Frita", R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas. Agregue arroz y frijoles por \$1.50 extra.", 15.99))
                menu.add(Product("Tostadas de Ceviche", R.drawable.ceviche, "Tilapia marinada en jugo de limón, mezclada con cebolla, cilantro y jitomate.", 3.99))
                menu.add(Product("Fajita Quesadilla", R.drawable.fajitaquesadilla, "Quesadilla extra grande, rellena con tu carne favorita, cebolla asada, chile bell pepper y tomate.", 12.99))
                menu.add(Product("Botana de Camarones", R.drawable.botanacamarones, "Camarones cocidos y pelados. Servidos en salsa picante especial.", 17.99))
                menu.add(Product("Coctel Camaron", R.drawable.coctel, "Camarones servidos en jugo de tomate dulce con cilantro, cebolla, jalapeño y aguacate.", 14.50))
            }
            "Combinations" -> {
                imageBanner.setImageResource(R.drawable.combinations)
                menu.add(Product("Traditional Taco Combo", R.drawable.combinationtaco, "Tortilla de maíz y tu carne favorita. Servido con arroz y frijoles. Corn taco, your choice of meat, served with rice and beans.\n" +
                        "\n", 6.99))
                menu.add(Product("Mexican Burritos", R.drawable.burritos, "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, sour cream, frijoles y acompañado de arroz. Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, and sour cream.", 11.99))
                menu.add(Product("Los Portales Burrito", R.drawable.burritosportales, "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole.", 12.99))
                menu.add(Product("Cinco", R.drawable.cinco, "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, and beans. Served with rice and beans.", 7.99))
                menu.add(Product("Dos Amigos", R.drawable.dosamigos, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. Served with a side of rice and beans.", 8.99))
                menu.add(Product("Burrito Pepe", R.drawable.burritopepe, "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. Served with a side of rice.", 7.49))
            }
            "Tortas" -> {
                imageBanner.setImageResource(R.drawable.tortas)
                menu.add(Product("Torta Regular", R.drawable.torta, "Bolillo con carne de tu elección, mayonesa, frijoles, lechuga, tomate y aguacate.", 9.99))
                menu.add(Product("Torta Milanesa", R.drawable.tortamilanesa, "Bolillo relleno con milanesa de res o pollo empanizada.", 12.99))
                menu.add(Product("Torta Cubana", R.drawable.tortacubana, "La gigante de la casa: milanesa, salchicha, jamón, queso derretido y chorizo.", 13.50))
                menu.add(Product("Torta Mixta", R.drawable.tortamixta, "Rellena de al pastor, asada y queso derretido.", 12.99))
            }
            "Sopas" -> {
                imageBanner.setImageResource(R.drawable.sopas)
                menu.add(Product("Pozole", R.drawable.pozole, "Semana de fin de semana, servido con repollo, rábanos y tostadas.", 5.99))
                menu.add(Product("Menudo", R.drawable.menudo, "Caldo tradicional servido con cebolla, cilantro y tortillas recién hechas.", 5.99))
                menu.add(Product("Caldo de Res", R.drawable.caldores, "Rico caldo de res con verduras, acompañado de arroz.", 5.99))
                menu.add(Product("Caldo de Camarón", R.drawable.caldocamaron, "Perfecto para revivir, caldo picosito con camarón entero.", 12.99))
                menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos, "Una mezcla de frutos del mar en un caldo reconfortante.", 19.99))
            }
            "Drinks" -> {
                imageBanner.setImageResource(R.drawable.drinks)
                menu.add(Product("Sodas 20oz", R.drawable.sodas, "Refrescos variados en botella de 20oz.", 2.99))
                menu.add(Product("Jarritos", R.drawable.jarritos, "Refresco tradicional mexicano de varios sabores.", 2.35))
                menu.add(Product("Domestic Beer", R.drawable.domesticbeer, "Cerveza nacional bien fría.", 3.55))
                menu.add(Product("Mexican Beer", R.drawable.mexicanbeer, "Importadas de México: Corona, Modelo, Pacífico.", 3.99))
                menu.add(Product("Micheladas", R.drawable.michelada, "Cerveza preparada con limón, sal y clamato.", 6.75))
                menu.add(Product("Caguama", R.drawable.caguama, "Cerveza familiar para compartir.", 8.99))
                menu.add(Product("Caguama Michelada", R.drawable.caguamamichelada, "Caguama preparada con clamato y salsas.", 10.99))
                menu.add(Product("Cubetazo", R.drawable.cubetazo, "Cubeta con 6 cervezas bien frías.", 21.99))
                menu.add(Product("Lada Charolazo", R.drawable.charolazo, "Bebida especial de la casa preparada.", 15.75))
            }
        }
    }
}