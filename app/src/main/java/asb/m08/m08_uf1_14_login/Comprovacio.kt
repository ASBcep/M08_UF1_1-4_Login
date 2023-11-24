package asb.m08.m08_uf1_14_login

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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

class Comprovacio: AppCompatActivity()
{
    object loginConstants
    {
        const val USERNAME = "userName"
        const val PASSWORD = "passWord"
        const val NOMCOMPLERT = "nomComplert"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comprovacio)

        val btnComprovar = this.findViewById<Button>(R.id.BtnComprovar)
        btnComprovar.setOnClickListener(
            //comprovar si el text escrit coincideix
        )
    }
}
