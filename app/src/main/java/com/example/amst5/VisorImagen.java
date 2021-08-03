package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class VisorImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);

        //Instanciar la imagen completa

        ImageView img =  (ImageView) findViewById(R.id.imageViewCompleta);

        Intent intent = getIntent();
        Bundle bimagen = intent.getExtras();  //Obtenemos la informacion enviada del intent

        if (bimagen != null){
            //settea la imagen segun la informacion que seleccionamos
            img.setImageResource(bimagen.getInt("IMG"));
        }

    }
}