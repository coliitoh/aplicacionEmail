package tpmenu.aplicacionemail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<mensaje> mensajes = new ArrayList<>();

        this.LosMensajes(mensajes);

        ListView Lista = (ListView) findViewById(R.id.Lista);
        Lista.setAdapter(new AdapterMensaje(mensajes));
        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                mensaje seleccionMsj = mensajes.get(position);
                //Toast.makeText(MainActivity.this,""+msj_select.getMail(),Toast.LENGTH_SHORT).show();
                Msj(seleccionMsj);

            }
        });
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
                Toast.makeText(MainActivity.this, "ACTUALIZANDO", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.VolverMenu:
                Toast.makeText(MainActivity.this, "Ustd. Se Encuentra en el MENU Inicial", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    private void LosMensajes (ArrayList<mensaje> mensajes){
           //String remitente, String email, String asunto, String contenido, String color,String fecha
        mensajes.add(new mensaje("Lautaro Da","Lau@gmail.com.ar","Compra De Carne","OFERTON ASADO EN TIRA $99, TAPA DE ASADO $110, MATABRE = $89, POLLO FRESCO $36","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Marcos luna","marc@gmail.com.ar","Venta de fotos","Fotos Bellas en solo 2 minutos","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Pablo Lmas","Pabloooo@gmail.com.ar","Carreras de Autos","Sabado por la noche carreras Nocturnas","#BDBDBD","21/08/2017"));
        mensajes.add(new mensaje("Florencia SUSU","florSu@gmail.com.ar","Carteleria Para Casas","Ploteos internos y externos a tan solo $22c/u, de difentens colores y formas","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Ignacio Perez","NachoPerez@gmail.com.ar","Robotica","Curso de Robotica lunes y miercoles de 18hs a 22hs","#BDBDBD","19/05/2017"));
        mensajes.add(new mensaje("Juan Nate","Jnatwe@gmail.com.ar","Golosinas Por Mayor","Caramelos $200 xkg, Chupetines $150 x 300gr","#BDBDBD","22/10/2017"));
        mensajes.add(new mensaje("Araceli Rodriguez","Araro@gmail.com.ar","Fiesta De Navidad","Traer a casa lo que van a consumir y lo que van tomar","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Barbara Sur","barbisur@gmail.com.ar","Asado en casa","Asado el domingo a las 23 hs, confirmar!!","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Carina Maldonado","carimaldonado@gmail.com.ar","Nuevos gustos de helado","Frutilla a la cocacola, tomate al dulce de leche","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Dario Rock","rockdaro@gmail.com.ar","Reggaeton 2017","Nuevos temas de reggaeton han salido","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Eleonor Artu","Eleartu@gmail.com.ar","Numeros","123456789-987654321","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Gordo Luis","Gordo@gmail.com.ar","Letras","ABCDEFGHI JKLMNOPQRS TUVWXYZ","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Hugo AroDa","HugoAro@gmail.com.ar","Insectos","Ataque de insectos en santa rosa","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Karen Kllidema","KarenAde@gmail.com.ar","Colores","Colores Primarios y Secundarios Brillosos","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Nico Rat","NicoR@gmail.com.ar","CounterStrike","Partido de counster strike el lunes por la mañana","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Lautaro Da","Lau@gmail.com.ar","Compra De Carne","OFERTON ASADO EN TIRA $99, TAPA DE ASADO $110, MATABRE = $89, POLLO FRESCO $36","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Marcos luna","marc@gmail.com.ar","Venta de fotos","Fotos Bellas en solo 2 minutos","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Pablo Lmas","Pabloooo@gmail.com.ar","Carreras de Autos","Sabado por la noche carreras Nocturnas","#BDBDBD","21/08/2017"));
        mensajes.add(new mensaje("Florencia SUSU","florSu@gmail.com.ar","Carteleria Para Casas","Ploteos internos y externos a tan solo $22c/u, de difentens colores y formas","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Ignacio Perez","NachoPerez@gmail.com.ar","Robotica","Curso de Robotica lunes y miercoles de 18hs a 22hs","#BDBDBD","19/05/2017"));
        mensajes.add(new mensaje("Juan Nate","Jnatwe@gmail.com.ar","Golosinas Por Mayor","Caramelos $200 xkg, Chupetines $150 x 300gr","#BDBDBD","22/10/2017"));
        mensajes.add(new mensaje("Araceli Rodriguez","Araro@gmail.com.ar","Fiesta De Navidad","Traer a casa lo que van a consumir y lo que van tomar","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Barbara Sur","barbisur@gmail.com.ar","Asado en casa","Asado el domingo a las 23 hs, confirmar!!","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Carina Maldonado","carimaldonado@gmail.com.ar","Nuevos gustos de helado","Frutilla a la cocacola, tomate al dulce de leche","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Dario Rock","rockdaro@gmail.com.ar","Reggaeton 2017","Nuevos temas de reggaeton han salido","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Eleonor Artu","Eleartu@gmail.com.ar","Numeros","123456789-987654321","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Gordo Luis","Gordo@gmail.com.ar","Letras","ABCDEFGHI JKLMNOPQRS TUVWXYZ","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Hugo AroDa","HugoAro@gmail.com.ar","Insectos","Ataque de insectos en santa rosa","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Karen Kllidema","KarenAde@gmail.com.ar","Colores","Colores Primarios y Secundarios Brillosos","#BDBDBD","22/03/2017"));
        mensajes.add(new mensaje("Nico Rat","NicoR@gmail.com.ar","CounterStrike","Partido de counster strike el lunes por la mañana","#BDBDBD","22/03/2017"));


    }
   private void Msj(mensaje seleccionMsj){
       Intent intent = new Intent(this, MensajeActivity.class);
     intent.putExtra("EMAIL",seleccionMsj.getEmail());
   intent.putExtra("REMITENTE",seleccionMsj.getRemitente());
   intent.putExtra("ASUNTO",seleccionMsj.getAsunto());
  intent.putExtra("MENSAJE",seleccionMsj.getContenido());
  startActivity(intent);
    }


}
