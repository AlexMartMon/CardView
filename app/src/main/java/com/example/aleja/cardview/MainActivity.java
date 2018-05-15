package com.example.aleja.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Object> lista;
    private RecyclerView recycler;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(obtenerEstablecimiento());
        recycler.setAdapter(adapter);
    }

    public ArrayList<Establecimiento> obtenerEstablecimiento(){
        ArrayList<Establecimiento> array = new ArrayList<>();
        array.add(new Establecimiento(R.drawable.gato,"Hola","adiossadasdasdasf "));
        array.add(new Establecimiento(R.drawable.gato,"Hola","adiossadasdasdasf "));
        array.add(new Establecimiento(R.drawable.gato,"Hola","adiossadasdasdasf "));
        array.add(new Establecimiento(R.drawable.gato,"Hola","adiossadasdasdasf "));
        array.add(new Establecimiento(R.drawable.gato,"Hola","adiossadasdasdasf "));
        return  array;
    }

}
