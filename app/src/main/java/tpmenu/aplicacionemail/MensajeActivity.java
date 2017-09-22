package tpmenu.aplicacionemail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MensajeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        Bundle extras = getIntent().getExtras();

            TextView txtMail = (TextView) findViewById(R.id.txtEmailMensaje);
            TextView txtRemitente = (TextView) findViewById(R.id.txtRemitente);
            TextView txtAsunto = (TextView) findViewById(R.id.txtAsunto);
            TextView txtMensaje = (TextView) findViewById(R.id.txtMensaje);


            txtMail.setText("Mail: "+extras.getString("EMAIL"));
            txtRemitente.setText("Nombre: " + extras.getString("REMITENTE"));
            txtAsunto.setText("Asunto: " + extras.getString("ASUNTO"));
            txtMensaje.setText("Mensaje:\n\t\t\t\t\t\t\t\t\t\t" + extras.getString("MENSAJE"));
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actualizar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ActualizarMenu:
                Toast.makeText(MensajeActivity.this, "ACTUALIZANDO", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.VolverMenu:
                Intent intent = new Intent(this, MainActivity.class);
                Toast.makeText(MensajeActivity.this, "Menu Inicial", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    }

