package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void abrirNavegador(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/?hl=es-419"));
        startActivity(i);
    }

    public void abrirMapa(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/QqmPf8r1Q7Au3fvx5"));
        startActivity(i);
    }

    public void mostratContactos(View v)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
        startActivity(i);
    }

    public void abrirCamara (View v)
    {
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }
}