package misael.itics.tesoem.edu.examenmisael;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class segundapantalla extends AppCompatActivity implements View.OnClickListener {

    Button saludobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segundapantalla);

        saludobtn = (Button) findViewById(R.id.button);

        saludobtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Bienvenido MISAEL SANCHEZ REYES",Toast.LENGTH_SHORT).show();
        saludobtn.setEnabled(false);
    }

    public void saludomen(View v){
        Toast.makeText(this, "HOLA PAPU", Toast.LENGTH_SHORT).show();
        saludobtn.setEnabled(false);
    }

    public void llamar(View v){
        Intent cargar = new Intent(this, OPERACIONESPANTALLA.class);
        startActivity(cargar);
    }
}
