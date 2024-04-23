package com.example.porkybank.ui.productos;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.porkybank.R;

public class ProductosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.fragment_productos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_productos), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void clickHipoteca (View view){

    }

    public void clickPrestamoActivity (View view){

    }

    public void clickNomina (View view){

    }

    public void clickTarjeta (View view){

    }


}
