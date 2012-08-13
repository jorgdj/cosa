package com.example.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Maincreado extends Activity {
	String[] datosRecibidos = new String[3];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincreado);
        Intent datos = getIntent();
        datosRecibidos = datos.getStringArrayExtra(Registro.ServiEntrega);
      
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_maincreado, menu);
        return true;
    }
}
