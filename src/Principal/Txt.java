package Principal;
import java.util.ArrayList;
import java.util.List;
import utilidades.GArchivosPlano;


public class Txt{
    private final String  NOMBRE = "miarch0.os";
    
    public String leerJugadores(String nombre, String posicion, String equipo, String fecha, String nacionalidad, float estatura){
        Jugador jug = new Jugador(nombre,posicion,equipo,fecha,nacionalidad,estatura);   
        /*jug.setNombre(jug.nombre); 
        jug.setAnio(jug.anio);
        jug.setEquipo(jug.equipo);*/
        //jug.setNombre(Utilidad.leerDatos());
        return jug.toString();
    }
    
    public boolean guardarJugador(String linea) {
       //String mensaje = "Los jugadores fueron guardados correctamente";
        List<String> jugador = new ArrayList<String>();
        jugador.add(linea);
        return GArchivosPlano.guardar(NOMBRE,jugador);
        
    }
    public List<String> leerArchivo(){
        return GArchivosPlano.leer(NOMBRE);
    }
}
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Principal.Jugador;

public class Txt {

    private String fileName; 
    private BufferedWriter bw;  
    private BufferedReader br; 
    private static Txt txt = null;

    private Txt() {          
        fileName = "miarch0.os";

    }

    public static Txt instancia() { 
        if (txt == null) {
            txt = new Txt();
        }
        return txt;
    }

    public String guardarJugador(List<Jugador> lista) {

        String mensaje = "Los jugadores fueron guardados correctamente";

        try {

            bw = new BufferedWriter(new FileWriter(fileName));
            for (Jugador jugador : lista) {
                bw.append(jugador.toRegistro());
                bw.newLine(); 
            }
            bw.close();
        } catch (IOException ex) {
            mensaje = "No se guardaron los datos error: " + ex.getMessage();
            
        }
        return mensaje;
    }
    public List<Jugador> leerJugadores(){
        List<Jugador> lista = new ArrayList();
        Jugador jugador;
        String linea = "";
        try {
            br = new BufferedReader(new FileReader(fileName));
            linea = br.readLine();
            while(linea !=null){
                jugador = new Jugador(linea);
                lista.add(jugador);
                linea = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            
        }
        return lista;
    }
}*/


