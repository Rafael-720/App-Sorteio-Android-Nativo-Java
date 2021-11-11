package com.oliveira.rafael.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo chamado pelo evento de clique no botão, para sortear o numero randomico e atribuir ao resultado
    public void sortear(View view){

        //variavel do tipo TextView atribuida ID da interface para ser manipulada internamente
        TextView resultado = findViewById(R.id.textResultado);

        //variavel que recebe um numero randomico entre 0 e 10
        int nAleatorio = new Random().nextInt(11);

        //setando a TextView para mostrar resultado
        resultado.setText("O Número é: " + nAleatorio);
    }
}
