package com.example.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	public final static String servientrega="com.example.login.registro";
	EditText usuario;
	EditText contrasena;
	String[] datoEnviar = new String[2];
	public final static String serviEntrega = "com.example.login.MENSAJE";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void enviarMensaje(View view) {
    	usuario=(EditText)findViewById(R.id.usuario);
    	contrasena=(EditText)findViewById(R.id.password);
    	
    	if(contrasena.getText().toString().equals(contrasena.getText().toString())&&(usuario.getText().toString().equals(usuario.getText().toString()))){
    		Toast.makeText(getApplicationContext(),"registro válido", Toast.LENGTH_LONG).show();
    		
    		datoEnviar[0] = usuario.getText().toString();
    		datoEnviar[1] = contrasena.getText().toString();
    		Intent nuevo = new Intent(MainActivity.this, Bienvenido.class);
    		nuevo.putExtra("ServiEntrega", datoEnviar);
    		startActivity(nuevo);
    	}
    	else{
    		Toast.makeText(getApplicationContext(),"registro inválido", Toast.LENGTH_LONG).show();
    	}
    }
    
    public void botonregistro(View view)
    {
        	
    Intent objEv = new Intent(MainActivity.this,Registro.class);	
    startActivity(objEv);
    
    }
    
    
    }

