package br.com.etecia.mybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Declarar a variável global do recyclerview
    RecyclerView listaLivros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //apresentando o xml para o java
        listaLivros = findViewById(R.id.idRecyclerViewLivros);

        //implementando o layout que será utilizado
        listaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //otimizar a lista quando for chamada
        listaLivros.hasFixedSize();

        //carregar o adaptador ao RecyclerView
        //listaLivros.setAdapter();

    }
}