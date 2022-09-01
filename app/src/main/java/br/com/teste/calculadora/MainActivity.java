package br.com.teste.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtNro1;
    private EditText txtNro2;
    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNro1 = findViewById(R.id.txtNro1);
        txtNro2 = findViewById(R.id.txtNro2);
        tvResultado = findViewById(R.id.tvResultado);
    }
    public void somar(View view) {
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());


        tvResultado.setText(String.valueOf(valor1 + valor2));
    }
    public void Subtrair(View view) {
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());


        tvResultado.setText(String.valueOf(valor1 - valor2));
    }
    public void D5ividir(View view) {
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());


        tvResultado.setText(String.valueOf(valor1 / valor2));
    }
    public void Multiplicar(View view) {
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());


        tvResultado.setText(String.valueOf(valor1 * valor2));
    }
}