package edu.tecii.android.catetoshipo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cateto1, cateto2,Resultado;
    EditText edt1, edt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cateto1 = (EditText)findViewById(R.id.edtxt1);
        cateto2 = (EditText)findViewById(R.id.edtxt2);
        Resultado = (TextView)findViewById(R.id.txt1);
    }

    public void calcular(View view){
        double hipotenusa, area, cat1,cat2;

        cat1 = Double.parseDouble(cateto1.getText().toString());
        cat2 = Double.parseDouble(cateto2.getText().toString());

        hipotenusa = Math.sqrt((Math.pow(cat1,2)) + Math.pow(cat2,2));

        area = (cat2*cat1)/2;

        Resultado.setText("Hipotenusa = " + String.format("%8.2f", hipotenusa) + "\nArea = " + String.format("%8.2f",area));

    }
}
