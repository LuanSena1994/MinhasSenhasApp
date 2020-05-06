package br.usjt.devmobile.minhassenhasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesSenhaActivity extends AppCompatActivity {

    private Senha senha;
    private TextView textViewNome;
    private TextView textViewUsuario;
    private TextView textViewSenha1;
    private TextView textViewUrl;
    private TextView textViewObservacao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_senha);
        Intent intent = getIntent();
        senha = (Senha)intent.getSerializableExtra("senha");
        textViewNome = findViewById(R.id.textViewNomeValue);
        textViewUsuario = findViewById(R.id.textViewUsuarioValue);
        textViewSenha1 = findViewById(R.id.textViewSenha1Value);
        textViewUrl = findViewById(R.id.textViewUrlValue);
        textViewObservacao = findViewById(R.id.textViewObsValue);
        textViewNome.setText(senha.getNome());
        textViewUsuario.setText(senha.getUsuario());
        textViewSenha1.setText(senha.getSenha());
        textViewUrl.setText(senha.getUrl());
        textViewObservacao.setText(senha.getObservacao());

    }
}
