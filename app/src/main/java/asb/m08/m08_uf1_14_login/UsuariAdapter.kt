package asb.m08.m08_uf1_14_login


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class UsuariAdapter (context: Context, val layout: Int, val usuaris: MutableList<Usuari>):
    ArrayAdapter<Usuari>(context, layout, usuaris)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        var view: View

        if(convertView != null)
        {
            view = convertView
        } else {
            view = LayoutInflater.from(getContext()).inflate(layout, parent, false)
        }

        bindUsuari(view, usuaris[position])

        return view
    }
    fun bindUsuari(view: View, usuari: Usuari)
    {
        val edTxtNomSencer = view.findViewById(R.id.EdTxtNomSencer) as EditText
        //edTxtNomSencer.setText(usuari.nomSencer.toString())
        edTxtNomSencer.setText(usuari.nomSencer)

    }
}