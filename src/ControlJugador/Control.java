package ControlJugador;


import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
//import javax.swing.JOptionPane;

import Principal.Jugador;
import Principal.Txt;
import java.util.Date;
public class Control {

    private Jugador jugador;
    private List<Jugador> jugadores;
    Txt txt = new Txt();

    public Control() {
        jugador=new Jugador();
        jugadores=new ArrayList<>();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setProducto(Jugador jugador) {
        this.jugadores = (List<Jugador>) jugador;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void adicionarJugadores(String nombre, String posicion, String equipo, String fecha, String nacionalidad, float estatura){
        jugador=new Jugador(nombre,posicion,equipo,fecha,nacionalidad,estatura);
        jugadores.add(jugador);
    }
    public DefaultListModel listarJugadores(){
        DefaultListModel model= new DefaultListModel(); 
        for(Jugador jug:jugadores){
            model.addElement(jug);
        }
        return model;
    }

    public void guardarJugadores(String nombre, String posicion, String equipo, String fecha, String nacionalidad, float estatura){
        String datosJugador = txt.leerJugadores(nombre,posicion,equipo,fecha,nacionalidad,estatura);
        txt.guardarJugador(datosJugador);
        /*String mensaje = txt.guardarJugador(linea);
        return mensaje;*/
    }
    
    public void leerJugadores(){

        txt.leerArchivo();
    }

    
}
