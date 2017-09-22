package tpmenu.aplicacionemail;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Coliitoh Rodriguez on 18/09/2017.
 */

public class AdapterMensaje extends BaseAdapter{
    private ArrayList<mensaje> mensajes;

    public AdapterMensaje(ArrayList<mensaje> mensajes  ) {
        this.mensajes = mensajes;
    }

    @Override
    public int getCount() {
        return mensajes.size();
    }

    @Override
    public Object getItem(int position) {
        return mensajes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_mensaje,parent,false);

        if(convertView==null){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_mensaje,parent,false);
        }
        else {
            view = convertView;//con este me fijo si la lista esta vacia o no! depende como este sigo imprimiendo o no.
        }

        mensaje mensaje = (mensaje) getItem(position);
        TextView remitente = (TextView) view.findViewById(R.id.remitente);
        TextView asunto = (TextView) view.findViewById(R.id.asunto);
        TextView fecha = (TextView) view.findViewById(R.id.fecha);
        TextView letra = (TextView) view.findViewById(R.id.imagen);

        remitente.setText(mensaje.getRemitente());
        asunto.setText(mensaje.getAsunto());
        fecha.setText(mensaje.getFecha());
        letra.setText(mensaje.getRemitente().substring(0,1));//traigo la primera letra del remitente
        letra.getBackground().setColorFilter(Color.parseColor(mensaje.getColor()), PorterDuff.Mode.SRC);

        //GENERE EL ADAPTADOR PARA MOSTRARSE


        return view;
    }
}
