package com.proyecto.diego.claseandroidredes;

import android.annotation.SuppressLint;
import android.nfc.cardemulation.CardEmulation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   public ImageButton btnLogin;
   public TextView txtDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (ImageButton) findViewById(R.id.button);
        txtDatos = (TextView) findViewById(R.id.textViewDatos);


        final DatosGenerales data = new DatosGenerales();

        data.Login("Diego","diemp94@gmail.com","123456");
        Log.i("data",data.getUser());
        data.Publicar("Este es mi primer mensaje de facebook");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String datos;
                datos = data.traerDatos();
                txtDatos.setText(datos);
            }
        });
    }
}
