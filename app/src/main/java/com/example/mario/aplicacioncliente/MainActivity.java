package com.example.mario.aplicacioncliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    //Metodos
    EditText lblNombre;
    EditText lblApellidos;
    EditText lblEdad;
    Spinner lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar los metodos
        lblNombre = findViewById(R.id.lblNombre);
        lblApellidos = findViewById(R.id.lblApellidos);
        lblEdad = findViewById(R.id.lblEdad);
        lista = (Spinner) findViewById(R.id.lista);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.datosCiviles, android.R.layout.simple_spinner_item);
        lista.setAdapter(adapter);

        //Borrar campos
        ImageButton btnBorrar = findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lblNombre.setText("");
                lblApellidos.setText("");
                lblEdad.setText("");

            }
        });
    }

}
