package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class VentanPorCategoria extends AppCompatActivity {


    ListView listaTerror;
    String[][] datoster = {
            {"Titulo: Frankenstein", "Autor: Marry Shelly", "Editorial: Lackington",
                    "LIBRO 2 BLABLABALBALABLABLABA"},
    };

    int[] datosImgTerror = {R.drawable.frankenstein };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listaTerror = (ListView) findViewById(R.id.listaLibro);    //Prueba

        listaTerror.setAdapter(new Adaptador(this, datoster, datosImgTerror));     //asignacion del adaptador

        listaTerror.setAdapter(new Adaptador(this, datoster, datosImgTerror)); // prueba

        listaTerror.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetalleLibro.class);
                visorDetalles.putExtra("TIT", datoster[position][0]);
                visorDetalles.putExtra("DET", datoster[position][3]);
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