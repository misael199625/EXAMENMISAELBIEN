package misael.itics.tesoem.edu.examenmisael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RESTA extends AppCompatActivity {
    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);

        num1 = (EditText) findViewById(R.id.txtnum);
        num2 = (EditText) findViewById(R.id.txtnum2);
        resultado = (TextView) findViewById(R.id.lblresultado2);

    }

    public void calcularesta(View v){
        int a,b,r;
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        r = a-b;
        resultado.setText(String.valueOf(r));

    }
}
