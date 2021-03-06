package com.example.ejercicio305;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarWeb(View view){
        Intent intent = new Intent(this, Web.class);
        startActivity(intent);
    }

    public void usarMaps(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.407695622531044, -4.4797421708025364"));
        startActivity(i);
    }
    public void sacarFoto(View view) {
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }

    public void llamadaTelefono(View view){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"));
        startActivity(i);
    }

    public void mandaCorreo(View view){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, "comprobando el correo");
        i.putExtra(Intent.EXTRA_TEXT, "ejercicio");
        i.putExtra(Intent.EXTRA_EMAIL, new String[] {"valle8.lopez8@gmail.com" });
        startActivity(i);
    }
}