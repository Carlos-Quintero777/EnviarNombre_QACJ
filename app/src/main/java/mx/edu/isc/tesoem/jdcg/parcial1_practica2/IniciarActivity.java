package mx.edu.isc.tesoem.jdcg.parcial1_practica2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View; // Importar View
import android.widget.EditText;

public class IniciarActivity extends AppCompatActivity {

    EditText txtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar);
        txtname = findViewById(R.id.txtname);
    }

    public void btnclick(View v) {
        Intent pantalla = new Intent(this, SaludoActivity.class);
        pantalla.putExtra("nombre", txtname.getText().toString());
        startActivity(pantalla);
        finish();
    }
}
