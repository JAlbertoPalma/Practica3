package mx.itson.edu.practicaa3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAntojitos: Button = findViewById(R.id.btn_antojitos)
        val btnEspecialidades: Button = findViewById(R.id.btn_especialidades)
        val btnCombinations: Button = findViewById(R.id.btn_combinations)
        val btnTortas: Button = findViewById(R.id.btn_tortas)
        val btnSopas: Button = findViewById(R.id.btn_sopas)
        val btnDrinks: Button = findViewById(R.id.btn_drinks)

        // Acción para cada botón
        btnAntojitos.setOnClickListener { navigateToProducts("Antojitos") }
        btnEspecialidades.setOnClickListener { navigateToProducts("Especialidades") }
        btnCombinations.setOnClickListener { navigateToProducts("Combinations") }
        btnTortas.setOnClickListener { navigateToProducts("Tortas") }
        btnSopas.setOnClickListener { navigateToProducts("Sopas") }
        btnDrinks.setOnClickListener { navigateToProducts("Drinks") }
    }

    private fun navigateToProducts(type: String) {
        val intent = Intent(this, ProductosActivity::class.java)
        intent.putExtra("menuType", type)
        startActivity(intent)
    }
}