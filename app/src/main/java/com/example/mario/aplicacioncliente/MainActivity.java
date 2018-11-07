package com.example.mario.aplicacioncliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    //Metodos
    EditText lblNombre;
    EditText lblApellidos;
    EditText lblEdad;
    Spinner lista;
    RadioGroup btnGrup;
    Switch switchHijo;
    Button btnEjemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar los metodos
        lblNombre = findViewById(R.id.lblNombre);
        lblApellidos = findViewById(R.id.lblApellidos);
        lblEdad = findViewById(R.id.lblEdad);
        lista = (Spinner) findViewById(R.id.lista);
        btnGrup = findViewById(R.id.btngrup);
        switchHijo = findViewById(R.id.switchHijo);


        //Switch
        if(switchHijo.isChecked()){
            //textView.setText("Sí");
        }else{
            //textView.setText("No");
        }


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
                btnGrup.clearCheck();
                lista.setSelection(0);
                switchHijo.setChecked(false);
            }
        });

        //Generar campos
      /*  Button btnEjemplo = findViewById(R.id.btnEjemplo);
        btnEjemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {txtinfo.getText(generar());}

                public String generar() {
                    String resultado = lblNombre.getText().toString() + ",";
                    return resultado;
                }
    });*/
    }
}
