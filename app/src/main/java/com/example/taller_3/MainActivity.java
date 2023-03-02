package com.example.taller_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;
    private RadioButton r1,r2,r3,r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);

    }
    public void operar(View view)
    {

        if(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty())
        {
            tv1.setText("Campos vacios, debe digitar numeros");

        }
        else if(r1.isChecked()==true || r2.isChecked()==true || r3.isChecked()==true || r4.isChecked()==true)
        {
            String valor1=et1.getText().toString();
            String valor2=et2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            if (r1.isChecked()==true) {
                int suma=nro1+nro2;
                String resu=String.valueOf(suma);
                tv1.setText(resu);
            }
            if (r2.isChecked()==true) {
                int resta=nro1-nro2;
                String resu=String.valueOf(resta);
                tv1.setText(resu);
            }
            if (r3.isChecked()==true) {
                int multiplicar=nro1*nro2;
                String resu=String.valueOf(multiplicar);
                tv1.setText(resu);
            }
            if (r4.isChecked()==true)
            {
                if(nro1>0 & nro2 >0)
                {
                    int dividir=nro1/nro2;
                    String resu=String.valueOf(dividir);
                    tv1.setText(resu);
                }
                else
                {

                    tv1.setText("El dividendo y el divisor debe ser mayor a 0");
                }

            }
        }
        else
        {
            tv1.setText("Debe selecionar un OPERADOR");
        }


    }

}