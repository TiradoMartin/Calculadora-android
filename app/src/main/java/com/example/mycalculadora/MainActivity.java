package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1, num2;
    Button suma1,resta1, mult1,div1;
    TextView resultadoss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById (R.id.num2);

        suma1  = (Button) findViewById(R.id.sumar);
        resta1 = (Button) findViewById(R.id.restar);
        mult1  = (Button) findViewById(R.id.mult);
        div1  = (Button)  findViewById(R.id.div);

        resultadoss = (TextView) findViewById(R.id.resultado);

        suma1.setOnClickListener(this);
        resta1.setOnClickListener(this);
        mult1.setOnClickListener(this);
        div1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1 =Integer.parseInt(n1);
        int entero2 =Integer.parseInt(n2);
        int rta = 0;


        switch (v.getId()){
        case R.id.sumar:
            rta = entero1 + entero2;
             break;
        case R.id.restar:
        rta = entero1 - entero2;
            break;
        case R.id.mult:
        rta = entero1 * entero2;
            break;
        case R.id.div:
        rta = entero1 / entero2;
            break;

        }
        resultadoss.setText(""+rta );
}
}