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

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    /*
        private val getResult =
            registerForActivityResult(
                ActivityResultContracts.StartActivityForResult())
            {
                val EdTxtNomSencer = findViewById(R.id.EdTxtNomSencer) as TextView
                if(it.resultCode == RESULT_OK) {
                    //retornar un string
                    val nomComplert = it.data?.getStringExtra(Comprovacio.loginConstants.NOMCOMPLERT)
                    /*retornar un objecte
                    val satellite = it.data?.getSerializableExtra()
                    */

                    EdTxtNomSencer.text = "Usuari i contrasenya correctes, " + nomComplert
                }else if (it.resultCode == RESULT_CANCELED){ //opcional, si no restorna RESULT_OK hauria de donar RESULT_CANCELLED
                    EdTxtNomSencer.text = "error1" //canviar a "Usuari i/o contrasenya incorrectes"
                }else { //menys codi que amb else if
                    EdTxtNomSencer.text = "error2" //canviar a "Usuari i/o contrasenya incorrectes"
                }
            }
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val usuaris = getUsuaris()
        val usuari = Usuari("cep", "informatica","Alex Saborit Bolea")
        val edTxtUsername = this.findViewById(R.id.EdTxtUsername) as EditText
        val edTxtPassword = this.findViewById(R.id.EdTxtPassword) as EditText

        val btnOk = this.findViewById(R.id.BtnLogin) as Button

        val username = edTxtUsername.text
        val password = edTxtPassword.text

        if (username = usuari.username.toString(){

            }
            if(password == usuari.password.toString()){

                btnOk.setOnClickListener(
                    if (username == usuari.username && password == usuari.password){
                        //event del botó, comprovar i si és correcte obrir segona activity
                    } else {
                        // Les credencials no són correctes, pots mostrar un missatge d'error o fer alguna altra acció aquí
                        Toast.makeText(this, "Credencials incorrectes", Toast.LENGTH_SHORT).show()
                    }
                )





            }

        private fun getUsuaris(): Any {
            /*return mutableListOf(Usuari("alex", "xela", "Alex Saborit"),
                                Usuari("admin", "nimda", "Administrador"))*/
            return Usuari("cep", "informatica","Alex Saborit Bolea")
        }
    }