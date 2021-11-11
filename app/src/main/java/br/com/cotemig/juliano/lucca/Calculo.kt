package br.com.cotemig.juliano.lucca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.NumberFormat

class Calculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        var txtdois = intent.getDoubleExtra("txtdois", 0.0)

        var calcular = findViewById<Button>(R.id.calcular)
        calcular.setOnClickListener {
            calculaSeguro(txtdois)
        }
    }

    fun calculaSeguro(txtdois: Double){
        var valor = findViewById<EditText>(R.id.valor)
        var valorVeiculo = valor.text.toString().toDouble()

        var seguro = (valorVeiculo * txtdois) / 100.0
        var parcela = seguro / 10.0

        var Valor_seguro = findViewById<TextView>(R.id.ValorSeguro)
        var Valor_parcela = findViewById<TextView>(R.id.ValorParcela)

        var f = NumberFormat.getCurrencyInstance()

        Valor_seguro.text = resources.getString(R.string.valorSeg, f.format(seguro))
        Valor_parcela.text = resources.getString(R.string.valorPar, f.format(parcela))
    }
}
