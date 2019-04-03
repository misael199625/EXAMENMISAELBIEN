package misael.itics.tesoem.edu.examenmisael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class POTENCIA extends AppCompatActivity {
    EditText num1;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potenci);

        num1 = (EditText) findViewById(R.id.txtnum);
        resultado = (TextView) findViewById(R.id.textView10);

    }

    public void calculaRPOTE(View v){
        int a,r;
        a = Integer.parseInt(num1.getText().toString());
        a = Integer.parseInt(num1.getText().toString());
        r = a*a;
        resultado.setText(String.valueOf(r));

    }
}

