/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1;

/**
 *
 * @author agost
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Personota = new Persona();
        System.out.println("Su nombre es " + Personota.getNombre() 
                            + "\n Su apellido es: " + Personota.getApellido()
                            + "\n Su edad es: " + Personota.getEdad() 
                            + "\n Su DNI es: " + Personota.getDNI() );
    }
    
}
