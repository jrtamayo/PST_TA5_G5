package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    // Metodo para el boton

    public void  Ingresar(View view){
        Intent ingresar = new Intent(this,MainActivity3.class);
        startActivity(ingresar);
    }

}