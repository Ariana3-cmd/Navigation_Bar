package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText txtcorreo, txtclave;
    private Button botonenviar;
    public final String user = "admin@gmail.com";
    static final String pass = "3ntr4r";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtcorreo = findViewById(R.id.edtcorreo);
        txtclave = findViewById(R.id.edtPassword);
        botonenviar = findViewById(R.id.button);
        botonenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtcorreo.getText().toString().equals(user) && txtclave.getText().toString().equals(pass)){
                    cargar(view);
                }else{
                    if (txtcorreo.getText().toString().equals("") && txtclave.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"Ingresar Datos", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Datos Incorrectos", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    public void  cargar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("pulpi",user);
        startActivity(intent);
    }
}