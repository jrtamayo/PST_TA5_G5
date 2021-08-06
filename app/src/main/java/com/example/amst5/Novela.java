package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Novela extends AppCompatActivity {

    ListView listaNovela;
    String[][] datosNovela = {
            {"Titulo: Cumanda", "Autor: Juan Leon Mera", "Editorial: Desconocido",
                    "LIBRO 3 BLABLABALBALABLABLABA"},
            {"Titulo: Cien años de Soledad", "Autor: Gabriel García Márquez",
                    "Editorial: Desconocido",
                    "LIBRO 3 BLABLABALBALABLABLABA"}
    };

    int[] datosImgNovela = {R.drawable.libro3, R.drawable.soledad };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listaNovela = (ListView) findViewById(R.id.listaLibro);    //Prueba

        listaNovela.setAdapter(new Adaptador(this, datosNovela, datosImgNovela));     //asignacion del adaptador

        listaNovela.setAdapter(new Adaptador(this, datosNovela, datosImgNovela)); // prueba

        listaNovela.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetalleLibro.class);
                visorDetalles.putExtra("TIT", datosNovela[position][0]);
                visorDetalles.putExtra("DET", datosNovela[position][3]);
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

    // Boton Categoria
    public void  Categoria(View view){
        Intent categoria = new Intent(this,MainActivity4Categorias.class);
        startActivity(categoria);
    }
}