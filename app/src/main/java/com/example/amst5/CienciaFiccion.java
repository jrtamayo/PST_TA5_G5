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
            {"Titulo: Cumanda", "Autor: Juan Leon Mera", "Editorial: Desconocido",
                    "SIPNOSIS \n Tras perder a su familia en un incendio, Carlos y su padre dejan su "+
                            "hacienda en la Sierra y se trasladan a la inexplorada Amazonía. "+
                            "Allí, el joven se enamora de Cumandá, una bella indígena. "+
                            "Sin embargo, las disputas entre aborígenes y colonos y un terrible "+
                            "pasado transformarán esta historia de amor en una tragedia. "+
                            "Un clásico de la literatura ecuatoriana."},
            {"Titulo: Cien años de Soledad", "Autor: Gabriel García Márquez",
                    "Editorial: Desconocido",
                    "SIPNOSIS \n Entre la boda de José Arcadio Buendía con Amelia Iguarán hasta "+
                            "la maldición de Aureliano Babilonia transcurre todo un siglo. "+
                            "Cien años de soledad para una estirpe única, fantástica, capaz "+
                            "de fundar una ciudad tan especial como Macondo y de engendrar "+
                            "niños con cola de cerdo. En medio, una larga docena de personajes "+
                            "dejarán su impronta a las generaciones venideras, que tendrán que "+
                            "lidiar con un mundo tan complejo como sencillo."},
    };

    int[] datosImgCiencia = {R.drawable.libro3, R.drawable.soledad };
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
