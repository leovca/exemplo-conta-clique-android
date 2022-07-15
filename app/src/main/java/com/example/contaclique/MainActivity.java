package com.example.contaclique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void atualizarContador(){
        TextView txtContador = findViewById(R.id.txtContador);
        txtContador.setText(String.valueOf(this.contador));
    }

    public void contar(View view){
        this.contador++;
        atualizarContador();
    }

    public void reiniciar(View view){
        this.contador = 0;
        atualizarContador();
    }

}