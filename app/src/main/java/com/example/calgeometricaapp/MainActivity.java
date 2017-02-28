package com.example.calgeometricaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgroup;
    RadioButton rbCuadro, rbTriangulo, rbCirculo, rbCubo;
    ImageView imagen;
    EditText ea, eb, ec, eh, er, eArea, ePerimetro, eVolumen;
    Button bCalcular;
    Double a, r, aTrian, bbTrian, cTrian, hTrian, aCubo, area, perimetro, volumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgroup = (RadioGroup) findViewById(R.id.rgroup);
        rbCuadro = (RadioButton) findViewById(R.id.rbCuadro);
        rbTriangulo = (RadioButton) findViewById(R.id.rbTriangulo);
        rbCirculo = (RadioButton) findViewById(R.id.rbCirculo);
        rbCubo = (RadioButton) findViewById(R.id.rbCubo);
        imagen = (ImageView) findViewById(R.id.imagen);
        ea = (EditText) findViewById(R.id.ea);
        eb = (EditText) findViewById(R.id.eb);
        ec = (EditText) findViewById(R.id.ec);
        eh = (EditText) findViewById(R.id.eh);
        er = (EditText) findViewById(R.id.er);
        eArea = (EditText) findViewById(R.id.eArea);
        ePerimetro = (EditText) findViewById(R.id.ePerimetro);
        eVolumen = (EditText) findViewById(R.id.eVolumen);
        bCalcular = (Button) findViewById(R.id.bCalcular);


        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbCuadro){

                    imagen.setImageResource(R.drawable.cuadro);

                    a=Double.parseDouble(ea.getText().toString());
                    perimetro=4*a;
                    area=a*a;
                }
                else if (checkedId == R.id.rbCirculo){

                    imagen.setImageResource(R.drawable.circulo);

                    r=Double.parseDouble(er.getText().toString());
                    area=3.1416*r*r;
                    perimetro=2*3.1416*r;
                }
                else if (checkedId == R.id.rbTriangulo){

                    imagen.setImageResource(R.drawable.triangulo);

                    aTrian=Double.parseDouble(ea.getText().toString());
                    bbTrian=Double.parseDouble(eb.getText().toString());
                    cTrian=Double.parseDouble(ec.getText().toString());
                    hTrian=Double.parseDouble(eh.getText().toString());
                    area=(bbTrian*hTrian)/2;
                    perimetro=aTrian+bbTrian+cTrian;
                }
                else if (checkedId == R.id.rbCubo){

                    imagen.setImageResource(R.drawable.cubo);

                    aCubo=Double.parseDouble(ea.getText().toString());
                    volumen=aCubo*aCubo*aCubo;
                }
            }
        });

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eArea.setText(String.valueOf(area));
                ePerimetro.setText(String.valueOf(perimetro));
            }
        });

    }
}
