package com.example.appamst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText edtUsuario, edtClave;
    private static Button btnLogin, btnRegistrarse, btnDesafio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsuario = findViewById(R.id.edtUsuario);
        edtClave = findViewById(R.id.edtClave);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegistrarse = findViewById(R.id.btnRegistrarse);
        btnDesafio = findViewById(R.id.btnDesafio);
    }

    private void registrarse(View view) {
        setButtonsClickable(false);
        Intent intent = new Intent(this, FormRegistroActivity.class);
        startActivity(intent);
    }

    private void login(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Usted no cuenta con un usuario",Toast.LENGTH_SHORT);
        toast.show();
    }

    private void showDesafio(View view) {
        setButtonsClickable(false);
        Intent intent = new Intent(this, DesafioActivity.class);
        startActivity(intent);
    }

    public static void setButtonsClickable(boolean value) {
        btnLogin.setClickable(value);
        btnRegistrarse.setClickable(value);
        btnDesafio.setClickable(value);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            login(v);
        } else if(v.getId() == R.id.btnRegistrarse) {
            registrarse(v);
        } else if (v.getId() == R.id.btnDesafio) {
            showDesafio(v);
        }
    }
}