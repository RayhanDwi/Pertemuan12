package com.example.login;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class Segitiga extends AppCompatActivity {
    private EditText edTinggi,edAlas;
    private Button bHasil, bKembali;
    private TextView thasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segitiga);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Edit Text
       edAlas = findViewById(R.id.editAlas);
       edTinggi = findViewById(R.id.editTinggi);

        //Button
        bHasil = findViewById(R.id.btnHasil);
        bKembali = findViewById(R.id.btnKembali);

        //
        thasil = findViewById(R.id.txtHasil);

        bHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float tinggi = Float.parseFloat(edTinggi.getText().toString());
                float alas = Float.parseFloat(edAlas.getText().toString());

                thasil.setText("Hasil : " + tinggi * alas + " cm ");
                thasil.setVisibility(View.VISIBLE);

            }
        });

        bKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            finish();
            }
        });

    }
}