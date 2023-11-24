package asb.m08.m08_uf1_14_login
/*
Realitzar una petita aplicació amb dues activities, on en la primera activity demanarem a l’usuari
el seu nom d’usuari i la seva contrasenya (recordeu que existeix un view per als passwords). En la
segona activity comprovarem si el nom d’usuari és “cep” i si la contrasenya és “informatica”. Si
les credencials són correctes, demanarem a l’usuari que introdueixi el seu nom complet i acabarem
retornant el nom introduït per l’usuari i RESULT_OK i en la primera activity mostrarem un missatge
indicant “Usuari i contrasenya correctes” i el nom complet de l’usuari. En cas que una de les dues
dades no sigui correcta, retornarem RESULT_CANCEL i mostrarem el missatge “Usuari i/o contrasenya
incorrectes”. Lliurarem l’aplicació comprimida junt amb el full de treball.
*/

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

        private val getResult =
            registerForActivityResult(
                ActivityResultContracts.StartActivityForResult())
            {
                val txtVwAnunci = findViewById(R.id.TxtVwAnunci) as TextView
                if(it.resultCode == RESULT_OK) {
                    //retornar un string
                    //val nomComplet = it.data?.getStringExtra(Comprovacio.loginConstants.USUARI)
                    /*retornar un objecte
                    val satellite = it.data?.getSerializableExtra()
                    */

                    txtVwAnunci.text = "Usuari i contrasenya correctes"
                }else if (it.resultCode == RESULT_CANCELED){ //opcional, si no restorna RESULT_OK hauria de donar RESULT_CANCELLED
                    txtVwAnunci.text = "Usuari i/o contrasenya incorrectes"
                }else { //menys codi que amb else if
                    txtVwAnunci.text = "Usuari i/o contrasenya incorrectes"
                }
            }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuari = Usuari("cep", "informatica", "Alex Saborit Bolea")
        val edTxtUsername = findViewById<EditText>(R.id.EdTxtUsername)
        val edTxtPassword = findViewById<EditText>(R.id.EdTxtPassword)
        val btnOk = findViewById<Button>(R.id.BtnLogin)

        btnOk.setOnClickListener {
            val username = edTxtUsername.text.toString()
            val password = edTxtPassword.text.toString()

            if (username == usuari.username && password == usuari.password) {
                // Credencials correctes, obre la segona activitat o fes alguna altra acció
                Toast.makeText(this, "Credencials correctes", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Comprovacio::class.java)
                intent. putExtra(Comprovacio.loginConstants.USUARI, usuari)
                //startActivity(intent)
                getResult.launch(intent)
            } else {
                // Les credencials no són correctes, mostra un missatge d'error
                Toast.makeText(this, "Credencials incorrectes", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun getUsuaris(): Any
    {
        /*return mutableListOf(Usuari("alex", "xela", "Alex Saborit"),
                            Usuari("admin", "nimda", "Administrador"))*/
        return Usuari("cep", "informatica","Alex Saborit Bolea")
    }
}