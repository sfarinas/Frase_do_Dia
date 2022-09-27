package com.farina.frasedodia;

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

    public void gerarNovaFrase(View view){
        String[] frase = {
            "Niguem paga almoço de graça",
            "Deixa de ser precoce ...",
            "Estudar por Osmose não é bom, mais eu faço",
            "FLAMENGOOOO!"
        };
        int numeros = new Random().nextInt(4);

        TextView texto = findViewById(R.id.fraseTexto);
        texto.setText( frase[numeros] );

    }

}