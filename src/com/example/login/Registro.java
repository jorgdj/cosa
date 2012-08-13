package com.example.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends Activity {
	EditText nusuario ;
	EditText ncontrasena ;
	EditText password;
	EditText email;
	String[] datoEnviar = new String[3];
	public final static String ServiEntrega = "com.example.login.MENSAJE";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_registro, menu);
        return true;
    }
    
    public void registro(View view){
    	nusuario=(EditText)findViewById(R.id.usuario);
    	ncontrasena=(EditText)findViewById(R.id.password);
    	password = (EditText) findViewById(R.id.verificar);
    	email = (EditText) findViewById(R.id.email);
    	
    	if(ncontrasena.getText().toString().equals(password.getText().toString())){
    		Toast.makeText(getApplicationContext(),"contraseña igual", Toast.LENGTH_LONG).show();
    		
    		datoEnviar[0] = nusuario.getText().toString();
    		datoEnviar[1] = ncontrasena.getText().toString();
    		datoEnviar[2] = email.getText().toString();
    		Intent nuevo = new Intent(Registro.this, Maincreado.class);
    		nuevo.putExtra("ServiEntrega", datoEnviar);
    		startActivity(nuevo);
    	}
    	else{
    		Toast.makeText(getApplicationContext(),"contraseña diferentes", Toast.LENGTH_LONG).show();
    	}
    	
    }
    
    public void botonregistro(View view)
    {
        	
    Intent objEv = new Intent(Registro.this,Maincreado.class);	
    startActivity(objEv);
    
    }
    
}