package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity3 extends AppCompatActivity implements SearchView.OnQueryTextListener{

    private SearchView buscador;

    ListView lista;

    ListView listaTerror; //prueba

    String[][] datos = {

            {"Titulo: Harry Potter", "Autor: Joanne Rowling", "Editorial: Salamandra",
                    "LIBRO 1 BLABLABALBALABLABLABA"},
            {"Titulo: Frankenstein", "Autor: Marry Shelly", "Editorial: Lackington",
                    "LIBRO 2 BLABLABALBALABLABLABA"},
            {"Titulo: Cumanda", "Autor: Juan Leon Mera", "Editorial: Desconocido",
                    "LIBRO 3 BLABLABALBALABLABLABA"},
            {"Titulo: Cien años de Soledad", "Autor: Gabriel García Márquez",
                    "Editorial: Desconocido",
                    "LIBRO 3 BLABLABALBALABLABLABA"},
            {"Titulo: Caperucita Roja", "Autor: Charles Perrault", "Editorial: Kinder- und Hausmärchen",
                    "  SIPNOSIS \n Una niña recibe de su madre el encargo de llevar una cesta " +
                            "a su abuela enferma que vive en el bosque, advirtiéndole que no " +
                            "hable con desconocidos. Pero por el camino se encuentra un lobo " +
                            "y se para a hablar con él, dándole detalles de lo que va a hacer. " +
                            "El lobo aprovecha para engañar a caperucita y llegar antes a casa " +
                            "de la abuelita, a quien se come, y luego ocupa su lugar para engañar " +
                            "a caperucita y comérsela también. Afortunadamente, un leñador" +
                            " que andaba por allí descubre al lobo durmiendo tras su comida," +
                            " y rescata a caperucita y su abuelita de la tripa del lobo, " +
                            "sustituyéndolas por piedras que hacen que el lobo se ahoge al ir " +
                            "a beber al río."},
    };

    //PRUEBA DE CAT
    String[][] datoscf = {

            {"Titulo: Harry Potter", "Autor: Joanne Rowling", "Editorial: Salamandra",
                    "LIBRO 1 BLABLABALBALABLABLABA"}
    };

    String[][] datosnov = {
            {"Titulo: Cumanda", "Autor: Juan Leon Mera", "Editorial: Desconocido",
                    "LIBRO 3 BLABLABALBALABLABLABA"},
            {"Titulo: Cien años de Soledad", "Autor: Gabriel García Márquez",
                    "Editorial: Desconocido",
                    "LIBRO 3 BLABLABALBALABLABLABA"}
    };

    String[][] datoster = {
            {"Titulo: Frankenstein", "Autor: Marry Shelly", "Editorial: Lackington",
                    "LIBRO 2 BLABLABALBALABLABLABA"},
    };

    String[][] datosinf = {
            {"Titulo: Caperucita Roja", "Autor: Charles Perrault", "Editorial: Kinder- und Hausmärchen",
            "  SIPNOSIS \n Una niña recibe de su madre el encargo de llevar una cesta " +
                    "a su abuela enferma que vive en el bosque, advirtiéndole que no " +
                    "hable con desconocidos. Pero por el camino se encuentra un lobo " +
                    "y se para a hablar con él, dándole detalles de lo que va a hacer. " +
                    "El lobo aprovecha para engañar a caperucita y llegar antes a casa " +
                    "de la abuelita, a quien se come, y luego ocupa su lugar para engañar " +
                    "a caperucita y comérsela también. Afortunadamente, un leñador" +
                    " que andaba por allí descubre al lobo durmiendo tras su comida," +
                    " y rescata a caperucita y su abuelita de la tripa del lobo, " +
                    "sustituyéndolas por piedras que hacen que el lobo se ahoge al ir " +
                    "a beber al río."},
    };

    int[] datosImg = {R.drawable.libro1, R.drawable.frankenstein , R.drawable.libro3,R.drawable.soledad,
            R.drawable.roja};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lista = (ListView) findViewById(R.id.listaLibro);
        listaTerror = (ListView) findViewById(R.id.listaLibro);    //Prueba

        buscador = findViewById(R.id.searchView);       // prueba B

        lista.setAdapter(new Adaptador(this, datos, datosImg));     //asignacion del adaptador

        lista.setAdapter(new Adaptador(this, datos, datosImg)); // prueba

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetalleLibro.class);
                visorDetalles.putExtra("TIT", datos[position][0]);
                visorDetalles.putExtra("DET", datos[position][3]);
                startActivity(visorDetalles);
            }
        });

        //La funcionalidad de buscar segun el texto
        buscador.setOnQueryTextListener(this);

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

    //Metodos para el buscador
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}