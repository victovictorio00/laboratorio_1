/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1;

/**
 *
 * @author agost
 */

public class Persona {
  private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }
  
     
    public Persona(){
        this.nombre = "Victor";
         this.apellido = "Victorio";
         this.edad = 18;
         this.DNI = "741941241";
        
    }
    public Persona( String nombre, String apellido, int edad, String DNI){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
    }
    
}
