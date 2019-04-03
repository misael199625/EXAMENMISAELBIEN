package misael.itics.tesoem.edu.examenmisael;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OPERACIONESPANTALLA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacionespantall);

    }
    public void llasu(View v) {
        Intent cargar = new Intent(this, SUMA.class);
        startActivity(cargar);

    }

    public void llare(View v) {
        Intent cargar = new Intent(this, RESTA.class);
        startActivity(cargar);

    }

    public void llapo(View v) {
        Intent cargar = new Intent(this, POTENCIA.class);
        startActivity(cargar);

    }

    public void fina(View v) {
        Intent cargar = new Intent(this, PANTALLASALIDA.class);
        startActivity(cargar);

    }



}
