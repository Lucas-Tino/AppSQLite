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
        supportActionBar?.setTitle("App Cadastro SQL")

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEndereco:EditText = findViewById(R.id.edtEndereco)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCep:EditText = findViewById(R.id.edtCep)
        val edtObservacoes:EditText = findViewById(R.id.edtObservacoes)
        val edtData:EditText = findViewById(R.id.edtData)

        val btnConfirmar:Button = findViewById(R.id.btnConfirmar)

        edtNome.setText(intent.getStringExtra("nome"))
        edtEndereco.setText(intent.getStringExtra("endereco"))
        edtBairro.setText(intent.getStringExtra("bairro"))
        edtCep.setText(intent.getStringExtra("cep"))
        edtObservacoes.setText(intent.getStringExtra("observacoes"))
        edtData.setText(intent.getStringExtra("data"))

        // SQLite
        val db = DBHelper(this, null)

        btnConfirmar.setOnClickListener {
            db.addPessoa(edtNome.text.toString(), edtEndereco.text.toString(), edtBairro.text.toString(),
                        edtCep.text.toString(), edtObservacoes.text.toString(), edtData.text.toString(),)
            finish()
        }
    }
}
