package sv.edu.ufg.fis.amb.practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.title = "Aguire Martinez"
        supportActionBar?.subtitle = "Universidad Francisco Gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater .inflate(R.menu.ufg_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.configuracion->{
                Toast.makeText(this,"usted ha seleccionado la opcion de configuracion",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.perfil->{
                Toast.makeText(this,"usted ha seleccionado la opcion de perfil",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.mapa->{
                Toast.makeText(this,"usted ha seleccionado la opcion de mapa",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nuevacuenta->{
                Toast.makeText(this,"usted ha seleccionado la opcion de nueva cuenta",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.salir->{
                Toast.makeText(this,"usted ha seleccionado la opcion de salir",Toast.LENGTH_SHORT).show()
                true
            }

            else -> false
        }


    }


}