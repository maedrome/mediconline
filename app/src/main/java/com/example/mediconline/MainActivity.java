package com.example.mediconline;

import android.content.Intent;

import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText edtUsuario, edtPasswd;
    private Button btnLogin, btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Mediconline);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        //Referencia a los controles
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtPasswd = (EditText) findViewById(R.id.edtPasswd);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin = (Button) findViewById(R.id.btnLogin);



    }
        public void registrarse(View view){
            Intent intent = new Intent(this, formulario_registro.class);
            startActivity(intent);
        }

        public void login(View view){
            Toast toast = Toast.makeText(getApplicationContext(), "Usted no cuenta con un usuario", Toast.LENGTH_SHORT);
            toast.show();
        }

        public void onClick(View v) {
            if(v.getId() == R.id.btnLogin){
                Log.d("mensaje","ïngreso");
            }else if(v.getId() == R.id.btnRegistro) {
            }
        }


}
