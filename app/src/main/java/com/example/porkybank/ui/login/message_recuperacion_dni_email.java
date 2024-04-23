package com.example.porkybank.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.porkybank.R;

public class message_recuperacion_dni_email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_message_recuperacion_dni_email);
        setTextView();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recuperar_dni_emain_mensaje), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void setTextView(){
        String text = getIntent().getStringExtra("titulo");
        TextView textView = findViewById(R.id.textView1);
        textView.setText(text);
    }

    public void clickButton(View view){
        Intent siguiente = new Intent(this, LoginActivity.class);
        siguiente.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(siguiente);
        finish();
    }
    public void clickEquis(View view){
        Intent siguiente = new Intent(this, LoginActivity.class);
        siguiente.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(siguiente);
        finish();
    }
}