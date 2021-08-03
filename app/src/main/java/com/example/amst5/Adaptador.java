package com.example.amst5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[] datosImg;

    public Adaptador(Context contexto, String[][] datos, int[] imagenes) {
        this.contexto = contexto;
        this.datos = datos;
        this.datosImg = imagenes;

        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final  View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView  titulo = (TextView) vista.findViewById(R.id.textView7);
        TextView  autor = (TextView) vista.findViewById(R.id.textView8);
        TextView  editorial = (TextView) vista.findViewById(R.id.textView9);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageViewLibro);

        titulo.setText(datos[i][0]);
        autor.setText(datos[i][1]);
        editorial.setText(datos[i][2]);
        imagen.setImageResource(datosImg[i]);


        imagen.setTag(i);    //Agrega etiqueta de la columna que se dio clic

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(contexto, VisorImagen.class);

                //Envia parametros a la siguiente actividad
                visorImagen.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivities(new Intent[]{visorImagen});
            }
        });

        return vista;
    }

    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
