package asb.m08.m08_uf1_14_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
        //const val USERNAME = "userName"
        //const val PASSWORD = "passWord"
        const val USUARI = "usuariConstant"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comprovacio)

        val intent = getIntent()
        val usuari = intent.getSerializableExtra(loginConstants.USUARI) as Usuari

        val edTxtNomSencer = this.findViewById<EditText>(R.id.EdTxtNomSencer)
        val btnComprovar = this.findViewById<Button>(R.id.BtnComprovar)

        val nomSencer = edTxtNomSencer.text.toString()

        btnComprovar.setOnClickListener()
        {
            //comprovar si el text escrit coincideix
            if (edTxtNomSencer.text.toString() == usuari.nomSencer)
            {
                Toast.makeText(this, "Nom correcte", Toast.LENGTH_SHORT).show()
                //tancar activity retornant un resultat
                setResult(RESULT_OK)
                //tancar activity
                //finish()
            } else {
                Toast.makeText(this, "Nom incorrecte", Toast.LENGTH_SHORT).show()
                //tancar activity sense retornar cap resultat
                setResult(RESULT_CANCELED)
                //tancar activity
                //finish()
            }
            //tancar activity
            finish()
        }
    }
}
