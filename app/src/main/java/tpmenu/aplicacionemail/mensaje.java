package tpmenu.aplicacionemail;

/**
 * Created by Coliitoh Rodriguez on 15/09/2017.
 */

public class mensaje {

    private String Remitente;
    private String Email;
    private String Asunto;
    private String Contenido;
    private String Color;
    private String Fecha;

    public mensaje(String remitente, String email, String asunto, String contenido, String color,String fecha) {
        Remitente = remitente;
        Email = email;
        Asunto = asunto;
        Contenido = contenido;
        Color = color;
        Fecha = fecha;
    }

    public String getRemitente() {
        return Remitente;
    }

    public String getEmail() {
        return Email;
    }

    public String getAsunto() {
        return Asunto;
    }

    public String getContenido() {
        return Contenido;
    }

    public String getColor() {
        return Color;
    }

    public String getFecha() {        return Fecha;
    }
}

