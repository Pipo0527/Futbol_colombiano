/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import ControlJugador.Control;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Utilidad {
    public static List<Jugador> leerDatos() {
        /*Scanner sc = new Scanner(System.in);
        System.out.print(mensaje + " : ");
        return sc.nextLine();*/
        Control con = new Control();
        return con.getJugadores();
    }
}
