package com.example.futappsoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.futappsoc.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nuevousuario(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
     public void existenteusuario(View view) {
         Intent intent = new Intent(this, UsuarioExistente.class);
         startActivity(intent);
    }
}