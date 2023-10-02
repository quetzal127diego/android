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

    public void abrirSegundaActividad(View v) {
        Intent i = new Intent(this, MainActivity3.class); // Reemplaza "SegundaActividad" con el nombre de tu segunda actividad
        startActivity(i);
    }

    public void enviarDatos(View v) {
        Intent i = new Intent(this, MainActivity3.class); // Reemplaza "OtraActividad" con el nombre de tu otra actividad
        i.putExtra("clave", "valor"); // Puedes agregar datos extras aquí
        startActivity(i);
    }

    public void realizarLlamada(View v) {
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:123456789")); // Reemplaza "123456789" con el número de teléfono que deseas llamar
        startActivity(i);
    }

    public void enviarCorreo(View v) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"diegomercado1099@gmial.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Asunto del correo");
        i.putExtra(Intent.EXTRA_TEXT, "Cuerpo del correo");
        startActivity(Intent.createChooser(i, "Enviar correo"));
    }



}