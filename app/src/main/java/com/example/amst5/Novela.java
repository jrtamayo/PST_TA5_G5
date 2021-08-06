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
                    "SIPNOSIS \n Tras perder a su familia en un incendio, Carlos y su padre dejan su "+
                            "hacienda en la Sierra y se trasladan a la inexplorada Amazonía."+
                            "Allí, el joven se enamora de Cumandá, una bella indígena."+
                            "Sin embargo, las disputas entre aborígenes y colonos y un terrible "+
                            "pasado transformarán esta historia de amor en una tragedia."+
                            "Un clásico de la literatura ecuatoriana."},
            {"Titulo: Cien años de Soledad", "Autor: Gabriel García Márquez",
                    "Editorial: Desconocido",
                    "SIPNOSIS \n Entre la boda de José Arcadio Buendía con Amelia Iguarán hasta "+
                            "la maldición de Aureliano Babilonia transcurre todo un siglo."+
                            "Cien años de soledad para una estirpe única, fantástica, capaz "+
                            "de fundar una ciudad tan especial como Macondo y de engendrar "+
                            "niños con cola de cerdo. En medio, una larga docena de personajes "+
                            "dejarán su impronta a las generaciones venideras, que tendrán que "+
                            "lidiar con un mundo tan complejo como sencillo."},
            {"Título: El Hobbit", "Autor: J. R. R. Tolkien", "Editorial: Booket",
                    "SINOPSIS \n Smaug parecía profundamente dormido cuando Bilbo espió una vez más desde la entrada."+
                            "¡Pero fingía estar dormido! ¡Estaba vigilando la entrada del túnel!... Sacado de su cómodo agujero-hobbit"+
                            "por Gandalf y una banda de enanos, Bilbo se encuentra de pronto en medio de una conspiración que pretende"+
                            "apoderarse del tesoro de Smaug el Magnífico, un enorme y muy peligroso dragón..."},
            {"Título: El conde de Montecristo", "Autor: Alejandro Dumas", "Editorial: Racuda Ediciones",
                    "SINOPSIS \n El conde de Montecristo es uno de los clásicos más populares de todos los tiempos. Desde su publicación, "+
                            "en 1844, no ha dejado de seducir al gran público con la inolvidable historia de su protagonista. Edmond Dantés es "+
                            "un joven marinero, honrado y cándido, que lleva una existencia tranquila. Quiere casarse con la hermosa Mercedes, "+
                            "pero su vida se verá arruinada cuando su mejor amigo, Ferdinand, deseoso de conquistar a su prometida, le traicione "+
                            "vilmente. Condenado a cumplir una condena que no merece en la siniestra prisión del castillo de If, Edmond "+
                            "vivirá una larga pesadilla de trece años. Obsesionado por su inesperado destino, dejará de lado sus convicciones en torno"+
                            "al bien y al mal, y se dedicará a tramar la venganza perfecta."}
    };

    int[] datosImgNovela = {R.drawable.libro3, R.drawable.soledad, R.drawable.hobbit,
            R.drawable.montecristo };
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
