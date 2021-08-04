package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_usuario);
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
}
