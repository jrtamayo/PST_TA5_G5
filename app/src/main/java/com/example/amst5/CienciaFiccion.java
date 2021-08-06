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
        {"Título: Guia del Autoestopista Galactico", "Autor: Douglas Adams", "Editorial: Anagrama",
            "SINOPSIS \n , Un jueves a la hora de comer, la Tierra es demolida para poder construir una nueva autopista hiperespacial."+
            "Arthur Dent, un tipo que esa misma mañana ha visto cómo echaban abajo su propia casa, "+
            "considera que eso supera lo que una persona puede soportar. Arthur huirá de la Tierra junto a un amigo suyo, "+
            "Ford Prefect, que resultará ser un extraterrestre emparentado con Zaphod Beeblebrox, "+
            "un pirata esquizoide de dos cabezas, en cuya nave conocerá al resto de personajes que lo acompañarán: "+
            "un androide paranoide y una terrícola que, como él, ha logrado escapar."},
        {"Título: Viaje al Centro de la Tierra", "Autor: Julio Verne", "Editorial: Hetzel",
            "SINOPSIS \n , El profesor Lidenbrock es un hombre mayor destacado por su inteligencia y terquedad, "+
            "logra descifrar un antiguo pergamino dándole sentido a los extraños signos que se encontraban escritos en él."+
            "Sin embargo, tras esos símbolos lo que se avecinaba era un gran peligro que arrastra al profesor Lidenbrock, "+
            "a su joven sobrino Axel y al valeroso cazador Hans Bjelke hacer un viaje al centro de la Tierra, "+
            "poblado de animales antediluvianos, tempestades terribles y otros riesgos sin mayor importancia."},
        {"Título: El Marciano", "Autor: Andy Weir", "Editorial: Nova",
            "SINOPSIS \n , Hace seis dias, el astronauta Mark Watney se convirtió en una de las primeras personas en caminar por Marte."+
            "Ahora, está seguro de que va a ser la primera persona en morir allí."+
            "Después de que una tormenta de polvo casi acabase con él y oblige a su tripulacion a evacuar dándolo por muerto, "+
            "Mark se encuentra atrapado y completamente solo, sin manera de enviar una señal a la tierra de que está vivo, "+
            "y aunque pudiera conseguir comunicarse, sus suministros se acabarían mucho antes de que el rescate llegase."}
    };

    int[] datosImgCiencia = {R.drawable.libro1, R.drawable.GuiaAutoGal,R.drawable.ViajeCentroTerra,R.drawable.Martian};
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
