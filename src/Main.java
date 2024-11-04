/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author casf9
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoBD objemple = new EmpleadoBD();
        objemple.insertar();
        objemple.consultar();
        objemple.actualizar();
        objemple.eliminar();
    }
    
    
}
