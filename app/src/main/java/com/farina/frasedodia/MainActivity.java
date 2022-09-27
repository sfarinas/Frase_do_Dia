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
            "Niguem paga almoço de graça",//1
            "Deixa de ser precoce ...",
            "Estudar por Osmose não é bom, mais eu faço",
            "FLAMENGOOOO!", //Cabo
            "Amanda Vai Durmir", //Simone
            "Sara come logo",    //Simone
            "Parei de jogar",//salomao
            "Quebrei meu tornozelo por que pisei errado"  //coba
        };
        int numeros = new Random().nextInt(8);

        TextView texto = findViewById(R.id.fraseTexto);
        texto.setText( frase[numeros] );

        switch (numeros){
            case 0: case 1: case 2: case 3 :
                TextView texto2 = findViewById(R.id.textAutor);
                texto2.setText("Alexandre Cabo");
                break;
            case 4: case 5:
                TextView texto3 = findViewById(R.id.textAutor);
                texto3.setText("Simone Farina");
                break;
            case 6:
                TextView texto4 = findViewById(R.id.textAutor);
                texto4.setText("Salomão Farina");
                break;
            case 7:
                TextView texto5 = findViewById(R.id.textAutor);
                texto5.setText("Rennan Santos (Koba)");
                break;
            default:
                TextView texto99 = findViewById(R.id.textAutor);
                texto99.setText("Nada");

        }

    }

}