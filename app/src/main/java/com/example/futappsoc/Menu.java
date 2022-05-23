package com.example.futappsoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void formulario(View view) {
        Intent intent = new Intent(this, Formulario.class);
        startActivity(intent);
    }
    public void mapa(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void informacion(View view) {
        Intent intent = new Intent(this, Formulario.class);
        startActivity(intent);
    }
}