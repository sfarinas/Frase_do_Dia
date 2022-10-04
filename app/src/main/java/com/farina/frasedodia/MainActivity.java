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
            "Ninguem paga almoço de graça",//0
            "Deixa de ser precoce ...",
            "Estudar por Osmose não é bom, mais eu faço",
            "FLAMENGOOOO!", //Cabo
            "Amanda Vai Durmir", //Simone
            "Sara come logo",    //Simone
            "Parei de jogar",//salomao
            "Quebrei meu tornozelo por que pisei errado",  //coba
            "As vezes as coisas demoram, mais acontecem, o importante é saber esperar e não perder a FÉ",
            "O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.",//10
                "Pensar é o trabalho mais difícil que existe. Talvez por isso tão poucos se dediquem a ele.",
                "Se o dinheiro for a sua esperança de independência, você jamais a terá. A única segurança verdadeira consiste numa reserva de sabedoria, de experiência e de competência.",
                "Quer você acredite que consiga fazer uma coisa ou não, você está certo.",
                "O mundo não é um mar de rosas; é um lugar sujo, um lugar cruel, que não quer saber o quanto você é durão. Vai botar você de joelhos e você vai ficar de joelhos para sempre se você deixar. Você, eu, ninguém vai bater tão forte como a vida, mas não se trata de bater forte. Se trata de quanto você aguenta apanhar e seguir em frente, o quanto você é capaz de aguentar e continuar tentando. É assim que se consegue vencer. Agora se você sabe do teu valor, então vá atrás do que você merece, mas tem que estar preparado para apanhar. E nada de apontar dedos, dizer que você não consegue por causa dele ou dela, ou de quem quer que seja. Só covardes fazem isso e você não é covarde, você é melhor que isso.",//11
                "A vida não é sobre quão duro você é capaz de bater, mas sobre quão duro você é capaz de apanhar e continuar indo em frente.",//12
                "Niguém baterá tão forte quanto a vida. Porém, não se trata de quão forte pode bater, se trata de quão forte pode ser atingido e continuar seguindo em frente. É assim que a vitória é conquistada.",//14
                "Não importa o quanto você bate, mas sim o quanto aguenta apanhar e continuar. O quanto pode suportar e seguir em frente. É assim que se ganha.",//14
                "O que me preocupa não é o grito dos maus. É o silêncio dos bons.",//15
                "Se um homem não descobriu nada pelo qual morreria, não está pronto para viver."//16
        };
        int numeros = new Random().nextInt(16);

        TextView texto = findViewById(R.id.fraseTexto);
        texto.setText( frase[numeros] );

        switch (numeros){
            case 0: case 1: case 2: case 3:
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
            case 8:
                TextView texto6 = findViewById(R.id.textAutor);
                texto6.setText("Victor Souza (RedeBR)");
                break;
            case 9:
                TextView texto7 = findViewById(R.id.textAutor);
                texto7.setText("Henry Ford");
                break;
            case 10: case 11: case 12: case 13: case 14:
                TextView texto8 = findViewById(R.id.textAutor);
                texto8.setText("Rocky Balboa");
                break;
            case 15: case 16:
                TextView texto9 = findViewById(R.id.textAutor);
                texto9.setText("Martin Luther King");
                break;
            default:
                TextView texto99 = findViewById(R.id.textAutor);
                texto99.setText("Nada");

        }

    }

}