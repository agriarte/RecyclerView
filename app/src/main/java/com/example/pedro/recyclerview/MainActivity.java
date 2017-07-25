package com.example.pedro.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> persons;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv =(RecyclerView) findViewById(R.id.rv);

        //asignar linearlayout estandar al recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        //mejora el rendimiento si es de tamaño fijo
        rv.setHasFixedSize(true);

        initializarDatos();
        inicializarAdapter();

    }

    private void initializarDatos(){
        persons = new ArrayList<>();
        persons.add(new Person("Pedro","46 años",R.drawable.pedro150));
        persons.add(new Person("Ivan","3 años",R.drawable.ivan150));
        persons.add(new Person("Natasha","41 años",R.drawable.natasha150));

    }

    private void inicializarAdapter(){
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);

    }
}
