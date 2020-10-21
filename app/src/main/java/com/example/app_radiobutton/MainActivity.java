package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    RadioButton rb1;
    RadioButton rb2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.num1);
        et2 = (EditText)findViewById(R.id.num2);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb2 = (RadioButton)findViewById(R.id.rb_resta);
        tv1 = (TextView)findViewById(R.id.tv_res);

    }

    public void calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        // Comprobamos si algun valor esta vacio para que muestre un aviso
        if((valor1.isEmpty() && valor2.isEmpty()) || (valor1.isEmpty() || valor2.isEmpty())){
            Toast.makeText(this, "Escribe los dos valores", Toast.LENGTH_SHORT).show();
        }else{
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            String resultado;
            if(rb1.isChecked()){
                int suma = sumar(n1, n2);
                tv1.setText(String.valueOf(suma));
            }
            else if(rb2.isChecked()){
                int resta = restar(n1, n2);
                tv1.setText(String.valueOf(resta));
                }else{
                Toast.makeText(this, "Tienes que seleccionar una de las opciones.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public int sumar(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int restar(int valor1, int valor2){
        return valor1 - valor2;
    }
}