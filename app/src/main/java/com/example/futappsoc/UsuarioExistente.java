package com.example.futappsoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UsuarioExistente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_existente);
    }
    public void menu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}