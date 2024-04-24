package com.example.mynavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void Cadastrar(View view){
        TextView campoNome;
        TextView campoEmail;
        TextView campoSenha;
        String nome;
        String email;
        String senha;

        campoNome = findViewById(R.id.nome);
        campoEmail = findViewById(R.id.emailCadastro);
        campoSenha = findViewById(R.id.senhaCadastro);
        nome = campoNome.getText().toString();
        email = campoEmail.getText().toString();
        senha = campoSenha.getText().toString();

        campoNome = findViewById(R.id.nome);
        campoEmail = findViewById(R.id.emailCadastro);
        campoSenha = findViewById(R.id.senhaCadastro);
        nome = campoNome.getText().toString();
        email = campoEmail.getText().toString();
        senha = campoSenha.getText().toString();

        ClasseCadastro cadastro1 = new ClasseCadastro(nome, email, senha);

        Intent mudarTela2 = new Intent(getApplicationContext(), login.class);
        mudarTela2.putExtra("objeto1", (CharSequence) cadastro1);
        startActivity(mudarTela2);

    }

    public void BotaoLogin (View view)
    {
        Intent mudarTela = new Intent(getApplicationContext(), login.class);
        startActivity(mudarTela);
    }
}