package mx.edu.isc.tesoem.jdcg.parcial1_practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    String nombre;
    TextView lblsaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        lblsaludo = findViewById(R.id.lblsaludo);
        Bundle parametros = getIntent().getExtras();
        nombre = parametros.getString("nombre");
        lblsaludo.setText("Bienvenido, "+nombre);
    }
}