package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    TextView Textoresultado;
    public int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     Textoresultado= (TextView)findViewById(R.id.contadorTexto);
     Textoresultado.setText("" + contador);
    contador = 0;
    }

    public void incrementarCont(View vista){
        contador++;
        Textoresultado.setText(""+ contador);
    }
    public void decrementaCont(View vista){
        contador--;
        if (contador<0){
            EditText hola = (EditText)findViewById(R.id.editText2);
            hola.setText("hola");
        }else {
            Textoresultado.setText("" + contador);
        }
    }
    public void reseteacontador( View vista){
        EditText hola1 = (EditText)findViewById(R.id.editText2);
        contador = Integer.parseInt(hola1.getText().toString());
        hola1.setText("");
        Textoresultado.setText(""+ contador);
    }

}
