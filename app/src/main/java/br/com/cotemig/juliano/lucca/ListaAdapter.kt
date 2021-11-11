package br.com.cotemig.juliano.lucca

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class ListaAdpter (var context: Context, var Lista: List<Lista>) : BaseAdapter() {

    override fun getCount(): Int {
        return Lista.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var view = LayoutInflater.from(context).inflate(R.layout.activity_lista, null)

        var txtum = view.findViewById<TextView>(R.id.txtum)
        txtum.text = Lista[p0].txtum

        var txtdois = view.findViewById<TextView>(R.id.txtdois)
        txtdois.text = String.format("%.2f", Lista[p0].txtdois)

        return view

    }
}