package com.example.porkybank.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.porkybank.R;

public class recuperarDNI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setupSpinner();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recuperar_dni);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recuperar_dni), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void setupSpinner(){
        String[] datos = {"DNI", "NIE", "NIF"};
        Spinner s = (Spinner) findViewById(R.id.spinnerTipoDocumento);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }

    public void clickEquis(View view){
        finish();
    }

    public void clickButton(View view){
        Intent siguiente = new Intent(this, message_recuperacion_dni_email.class);
        siguiente.putExtra("titulo", "Te hemos enviado un mensaje al teléfono que " +
                "acaba en *738 con instrucciones para poder recuperar tu contraseña.");
        startActivity(siguiente);
    }
}