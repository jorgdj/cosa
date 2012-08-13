package com.example.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bienvenido extends Activity {
	
	TextView mensaje;
	String[] datosRecibidos = new String[2];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
        Intent datos = getIntent();
        datosRecibidos = datos.getStringArrayExtra(Registro.ServiEntrega);
    }

}
