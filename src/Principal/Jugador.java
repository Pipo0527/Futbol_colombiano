
package Principal;

import java.util.Date;
import java.util.StringTokenizer;

public class Jugador {
    public String nombre;
    public String posicion; 
    public String equipo;
    public String fecha;
    public String nacionalidad;
    public float estatura;
    
    public Jugador(){
    }

    /*public Jugador(String nombre, int anio, String equipo) {
        this.nombre = nombre;
        this.anio = anio;
        this.equipo = equipo;
    }*/

    public Jugador(String nombre, String posicion, String equipo, String fecha, String nacionalidad, float estatura) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
        this.fecha = fecha;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
    }

    

    
    /*public Jugador(String linea){
        StringTokenizer token = new StringTokenizer(linea,"#");      
        this.nombre = token.nextToken();
        this.anio = Integer.parseInt(token.nextToken());
        this.equipo = token.nextToken();
    }
*/
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String Nombre)
    {
        this.nombre = Nombre;
    }


    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    
    
    @Override
    public String toString(){
        return  "Equipo: "+equipo+"   Jugador: "+nombre+"   Año de nacimiento: "+ fecha
                +"   Nacionalidad: "+nacionalidad+"   Posicion: "+posicion+"   Estatura: "+estatura;
    }
    
    public String toRegistro(){
         return "Nombre: "+nombre+"   Fecha Nacimiento: "+fecha+"   Equipo: "+equipo
                 +"   Nacionalidad: "+nacionalidad+"   Posicion: "+posicion+"   Estatura: "+estatura;
     }
}
