package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleLibro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_libro);

        TextView titulo = (TextView) findViewById(R.id.tituloDescripcion);
        TextView detalles = (TextView) findViewById(R.id.InformacionDescripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b!=null){
            titulo.setText(b.getString("TIT"));
            detalles.setText(b.getString("DET"));
        }

    }
}