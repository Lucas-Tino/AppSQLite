package com.example.appsqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.apprevisao.db.DBHelper
import com.example.appsqlite.R

class RespostaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_AppSQLite)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resposta)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtCpf:EditText = findViewById(R.id.edtCpf)
        val edtEndereco:EditText = findViewById(R.id.edtEndereco)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCidade:EditText = findViewById(R.id.edtCidade)
        val edtCep:EditText = findViewById(R.id.edtCep)
        val btnConfirmar:Button = findViewById(R.id.btnConfirmar)

        edtNome.setText(intent.getStringExtra("nome"))
        edtCpf.setText(intent.getStringExtra("cpf"))
        edtEndereco.setText(intent.getStringExtra("endereco"))
        edtBairro.setText(intent.getStringExtra("bairro"))
        edtCidade.setText(intent.getStringExtra("cidade"))
        edtCep.setText(intent.getStringExtra("cep"))

        // SQLite
        val db = DBHelper(this, null)

        btnConfirmar.setOnClickListener {
            db.addPessoa(edtNome.text.toString(), edtCpf.text.toString(), edtEndereco.text.toString(), edtBairro.text.toString(),
                edtCidade.text.toString(), edtCep.text.toString())
            finish()
        }
    }
}
