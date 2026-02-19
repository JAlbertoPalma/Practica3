package mx.itson.edu.practicaa3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        btnAntojitos.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent)
        }

        btnCombinations.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Combinations")
            startActivity(intent)
        }

        btnTortas.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)
        }

        btnSopas.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Drinks")
            startActivity(intent)
        }
    }
}