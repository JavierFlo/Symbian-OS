package com.itch2.plat2.symbian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button btnQueEs;
    Button btnCaracteristicas;
    Button btnHistoria;
    Button btnArquitectura;
    Button btnEvolucion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnQueEs=(Button) findViewById(R.id.btnQueEs);
        btnCaracteristicas=(Button) findViewById(R.id.btnCarateristicas);
        btnHistoria=(Button) findViewById(R.id.btnHistoria);
        btnArquitectura=(Button) findViewById(R.id.btnArquitectura);
        btnEvolucion=(Button) findViewById(R.id.btnEvolucion);

        btnQueEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent definicion = new Intent(Principal.this,Definicion.class);
                startActivity(definicion);

            }
        });

        btnCaracteristicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Caracteristicas = new Intent(Principal.this,Caracteristicas.class);
                startActivity(Caracteristicas);

            }
        });

        btnHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historia = new Intent(Principal.this,Historia.class);
                startActivity(historia);

            }
        });
        btnArquitectura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Arquitectura = new Intent(Principal.this,Arquitectura.class);
                startActivity(Arquitectura);

            }
        });
        btnEvolucion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Evolucion = new Intent(Principal.this,Evolucion.class);
                startActivity(Evolucion);

            }
        });
    }

    
}
