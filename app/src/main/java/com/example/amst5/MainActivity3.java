package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {
    ListView lista;
    String[][] datos = {
            {"Titulo: Harry Potter", "Autor: Joanne Rowling", "Editorial: Salamandra",
                    "LIBRO 1 BLABLABALBALABLABLABA"},
            {"Titulo: Don quijote de la Mancha", "Autor: Miguel de Cervantes", "Editorial: Francisco de Robles",
                    "LIBRO 2 BLABLABALBALABLABLABA"},
            {"Titulo: Cumanda", "Autor: Juan Leon Mera", "Editorial: Desconocido",
                    "LIBRO 3 BLABLABALBALABLABLABA"},
            {"Titulo: Diario de Ana Frank", "Autor: Annelies Frank", "Editorial: Garbo",
                    "LIBRO 4 BLABLABALBALABLABLABA"},
    };

    int[] datosImg = {R.drawable.libro1, R.drawable.libro2 , R.drawable.libro3, R.drawable.libro4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lista = (ListView) findViewById(R.id.listaLibro);

        lista.setAdapter(new Adaptador(this, datos, datosImg));     //asignacion del adaptador

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetalleLibro.class);
                visorDetalles.putExtra("TIT", datos[position][0]);
                visorDetalles.putExtra("DET", datos[position][3]);
                startActivity(visorDetalles);
            }
        });

    }

    // Boton de lista
    public void  Lista(View view){
        Intent listado = new Intent(this,MainActivity3.class);
        startActivity(listado);
    }
    // Boton Usuario
    public void  Usuario(View view){
        Intent usuario = new Intent(this,MainActivity4Usuario.class);
        startActivity(usuario);
    }




}