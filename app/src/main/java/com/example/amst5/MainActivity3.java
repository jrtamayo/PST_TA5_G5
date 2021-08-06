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
                    " SIPNOSIS \n Harry Potter se ha quedado huérfano y vive en casa de sus abominables tíos y el insoportable primo Dudley. " + 
                                "Harry se siente muy triste y solo, hasta que un buen día recibe una carta que cambiará su vida para siempre. " +
                                "En ella le comunican que ha sido aceptado como alumno en el Colegio Hogwarts de Magia. A partir de ese momento, " +
                                "la suerte de Harry da un vuelco espectacular. En esa escuela tan especial aprenderá encantamientos, trucos fabulosos " +
                                "y tácticas de defensa contra las malas artes. Se convertirá en el campeón escolar de Quidditch, especie de fútbol aéreo " +
                                "que se juega montado sobre escobas, y hará un puñado de buenos amigos... aunque también algunos temibles enemigos. " +
                                "Pero, sobre todo, conocerá los secretos que le permitirán cumplir su destino. Pues, aunque no lo parezca a primera vista, " +
                                "Harry no es un chico común y corriente: ¡es un verdadero mago"},
            {"Titulo: Frankenstein", "Autor: Marry Shelly", "Editorial: Lackington",
                    "SIPNOSIS \n Frankenstein es una historia macabra en la que Víctor, un joven ávido de conocimientos científicos, " +
                        "se obsesiona por lograr el mayor reto posible en el mundo científico: dar vida a un cuerpo muerto. " +
                         "Su éxito será su condena, la creación de un monstruo estremecedor que, en respuesta a su rechazo " +
                         "por todos se entrega por completo a saciar una sed de venganza hacia su creador, culpable de su desgracia, " +
                         "y hacia todo lo que éste ama, tornando en muerte todo alrededor de Víctor. El monstruo, enfermo de soledad," +
                         "solicita una compañera a su creador a cambio de desaparecer para siempre, pero Víctor se niega a ello, " +
                         "provocando así que la única salida hacia la paz y el descanso sea el fin de uno de los dos."},
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
