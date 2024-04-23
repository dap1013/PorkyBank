package com.example.porkybank.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.porkybank.R;

public class recuperarEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recuperar_email);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recuperar_email), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void clickEquis(View view){

    }

    public void clickButton(View view){
        Intent siguiente = new Intent(this, message_recuperacion_dni_email.class);
        siguiente.putExtra("titulo", "Te hemos enviado un email al correo proporcionado con las instrucciones para poder recuperar la contraseña.");
        startActivity(siguiente);
    }
}