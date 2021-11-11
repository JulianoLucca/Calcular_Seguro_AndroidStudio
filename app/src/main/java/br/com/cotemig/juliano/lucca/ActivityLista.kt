package br.com.cotemig.juliano.lucca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class ActivityLista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.primeira_tela)

        var textos = ArrayList<Lista>()
        textos.add(Lista("18 a 24 anos",5.0))
        textos.add(Lista("25 a 30 anos",4.0))
        textos.add(Lista("31 a 40 anos",3.5))
        textos.add(Lista("Acima de 40 anos",3.3))


        var seguro = findViewById<ListView>(R.id.lvlista)
        seguro.adapter = ListaAdpter(this, textos)

        seguro.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, Calculo::class.java)
            intent.putExtra("txtdois", textos[i].txtdois)
            startActivity(intent)
        }

    }
}