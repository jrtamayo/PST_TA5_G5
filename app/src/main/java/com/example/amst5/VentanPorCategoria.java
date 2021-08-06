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
                    "SINOPSIS:\n Frankenstein es una historia macabra en la que Víctor, un joven ávido de conocimientos científicos,"+
            " se obsesiona por lograr el mayor reto posible en el mundo científico: dar vida a un cuerpo muerto."+
            "Su éxito será su condena, la creación de un monstruo estremecedor que,"+ "n respuesta a su rechazo por todos se entrega por completo a"
            +"saciar una sed de venganza hacia su creador, culpable de su desgracia,"+ "y hacia todo lo que éste ama, tornando en muerte todo"+
            "alrededor de Víctor. El monstruo,"+"enfermo de soledad, solicita una compañera a su creador a cambio de desaparecer para siempre,"+
            "pero Víctor se niega a ello, provocando así que la única salida hacia la"+"paz y el descanso sea el fin de uno de los dos."},
            {"Título: Drácula", "Autor: Bram Stoker", "Editorial: Valdemar",
                    "SIPNOSOS \n Cuando Jonathan Harker viajó a Transilvania por asuntos de negocios, nunca"+
                            "imaginó el peligro que corría. Su cliente, el magnético conde Drácula, lo mantiene"+
                            "prisionero y Harker adivina sus oscuros propósitos: viajar a Londres para"+
                            "sembrar el terror y cosechar víctimas con las que saciar su apetito de sangre."+
                            "En Inglaterra, Lucy Westenra pasa de la felicidad por su futuro matrimonio a un"+
                            "letargo inexplicable. Cada vez más débil, preocupa a sus amigos con su palidez y"+
                            "unas extrañas heridas en el cuello. Su amigo, el doctor Seward, decide llamar al"+
                            "profesor Van Helsing para que tome cartas en el asunto. Pronto, el círculo que"+
                            "rodea a Lucy va a vivir una experiencia aterradora que pondrá a prueba su valor."},
            {"Título: El misterio de Salem's Lot", "Autor: Stephen King", "Editorial: Doubleday",
                    "SINOPSIS \n Salem's Lot es un pueblo tranquilo donde nunca pasa nada. O quizás esto son solo apariencias,"+
                            "pues lo cierto es que sí se están sucediendo diversos hechos misteriosos, incluso escalofriantes...."+
                            "Veinte años atrás, por una apuesta infantil, Ben Mears entró en la casa de los Marsten. Y lo que"+
                            "vio entonces aún recorre sus pesadillas. Ahora, como escritor consagrado, vuelve a Salem's Lot"+
                            "para exorcizar sus fantasmas. Salem's Lot es un pueblo tranquilo y adormilado donde nunca pasa nada..., "+
                            "excepto la antigua tragedia de la casa de los Marsten. Y el perro muerto colgado de la verja del cementerio. Y el"+
                            "tragedia de la casa de los Marsten. Y el perro muerto colgado de la verja del cementerio. Y el"+
                            "animales que mueren desangrados... Y la espantosa presencia de Ellos, quienesquiera que sean ELLOS."}

    };

    int[] datosImgTerror = {R.drawable.frankenstein, R.drawable.libroDracula, R.drawable.libroSalem };
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