package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Infantil extends AppCompatActivity {


    ListView listaInfantil;
    String[][] datosInfantil = {
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
                            "sustituyéndolas por piedras que hacen que el lobo se ahogue al ir " +
                            "a beber al río."},
            {"Titulo: Patito Feo", "Autor: Hans Christian Andersen", "Editorial: Everest",
                    "  SIPNOSIS \n Esta es la historia de un cisne que nace en un corral de patos. " +
                            "Ridiculizado por ser diferente, huye, pero donde quiera que va, " +
                            "tropieza con la misma incomprensión, hasta que al fin crece y se " +
                            "convierte en la más hermosa y admirada criatura."},
            {"Titulo: Los Tres Cerditos", "Autor: James Halliwell-Phillips", "Editorial: Viking Press",
                    "  SIPNOSIS \n Los tres cerditos viven con su madre hasta que un día ella les dice " +
                            "que tienen que independizarse. Se despiden de ella y cada uno construye " +
                            "una casa: de paja, de madera y de ladrillos. Pero el lobo feroz destruye " +
                            "la casa de paja y la de madera y los cerditos huyen a casa de su hermano. " +
                            "¿Conseguirán superar su miedo y vencer al lobo?"},
            {"Titulo: Hansel y Gretel", "Autor: Jacob Grimm y Wilhelm Grimm", "Editorial: Hermanos Grimm",
                    "  SIPNOSIS \n Hansel y Gretel es otra de las maravillosas historias que recopilaron " +
                            "los Hermanos Grimm, inmortalizada en diferentes adaptaciones teatrales  " +
                            "y musicales. El relato presenta al pequeño Hansel y su hermana Gretel  " +
                            "que, perdidos en el bosque, encuentran una casita construida con las  " +
                            "más suculentas golosinas. Los niños no pueden resistirse a los caramelos " +
                            "y bombones rellenos y empiezan a devorar la casa a trocitos. En la casa " +
                            "habita una bruja a quien también le gustan las golosinas... pero para ella " +
                            "las más suculentas son las que están recubiertas de niño tierno."},
    };

    int[] datosImgInfantil = {R.drawable.roja, R.drawable.patitofeo, R.drawable.lostrescerditos, R.drawable.hanselygretel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listaInfantil = (ListView) findViewById(R.id.listaLibro);    //Prueba

        listaInfantil.setAdapter(new Adaptador(this, datosInfantil, datosImgInfantil));     //asignacion del adaptador

        listaInfantil.setAdapter(new Adaptador(this, datosInfantil, datosImgInfantil)); // prueba

        listaInfantil.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetalleLibro.class);
                visorDetalles.putExtra("TIT", datosInfantil[position][0]);
                visorDetalles.putExtra("DET", datosInfantil[position][3]);
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
