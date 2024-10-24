package com.example.laboratorio5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout button1 = findViewById(R.id.custom_button1);
        LinearLayout button2 = findViewById(R.id.custom_button2);

        ImageView image1 = button1.findViewById(R.id.button_image);
        TextView text1 = button1.findViewById(R.id.button_text);

        ImageView image2 = button2.findViewById(R.id.button_image);
        TextView text2 = button2.findViewById(R.id.button_text);

// Configurar imagen y texto del primer botón
        image1.setImageResource(R.drawable.catedral); // Imagen de la Catedral
        text1.setText("Catedral de Arequipa");

// Configurar imagen y texto del segundo botón
        image2.setImageResource(R.drawable.claustro); // Imagen del Claustro
        text2.setText("Claustros de la Compañía");


        button1.setOnClickListener(v -> {
            Fragment fragment = new Fragment1();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });

        button2.setOnClickListener(v -> {
            Fragment fragment = new Fragment2();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
    }
}