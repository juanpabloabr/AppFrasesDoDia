package com.juan.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Atributo

    String[] frases = {"Frase 01","Frase 02", "Frase 03"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(3);
        String fraseGerada = frases[numeroAleatorio];
        texto.setText(fraseGerada);
    }

    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);
        String textoResultado = "";
        for (String frase: frases){ //Percorre o array frases e aloca na string frase criada no for
            //System.out.println(frase);
            textoResultado = textoResultado + frase + "\n";
        }
            texto.setText(textoResultado);

    }
}