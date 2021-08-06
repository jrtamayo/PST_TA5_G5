package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CienciaFiccion extends AppCompatActivity {

    ListView listaCiencia;
    String[][] datosCiencia = {
            {"Titulo: Harry Potter", "Autor: Joanne Rowling", "Editorial: Salamandra",
                    " SIPNOSIS \n Harry Potter se ha quedado huérfano y vive en casa de sus abominables tíos y el insoportable primo Dudley. " +
                            "Harry se siente muy triste y solo, hasta que un buen día recibe una carta que cambiará su vida para siempre. " +
                            "En ella le comunican que ha sido aceptado como alumno en el Colegio Hogwarts de Magia. A partir de ese momento, " +
                            "la suerte de Harry da un vuelco espectacular. En esa escuela tan especial aprenderá encantamientos, trucos fabulosos " +
                            "y tácticas de defensa contra las malas artes. Se convertirá en el campeón escolar de Quidditch, especie de fútbol aéreo " +
                            "que se juega montado sobre escobas, y hará un puñado de buenos amigos... aunque también algunos temibles enemigos. " +
                            "Pero, sobre todo, conocerá los secretos que le permitirán cumplir su destino. Pues, aunque no lo parezca a primera vista, " +
                            "Harry no es un chico común y corriente: ¡es un verdadero mago"},
    };

    int[] datosImgCiencia = {R.drawable.libro1 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listaCiencia = (ListView) findViewById(R.id.listaLibro);    //Prueba

        listaCiencia.setAdapter(new Adaptador(this, datosCiencia, datosImgCiencia));     //asignacion del adaptador

        listaCiencia.setAdapter(new Adaptador(this, datosCiencia, datosImgCiencia)); // prueba

        listaCiencia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetalleLibro.class);
                visorDetalles.putExtra("TIT", datosCiencia[position][0]);
                visorDetalles.putExtra("DET", datosCiencia[position][3]);
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
