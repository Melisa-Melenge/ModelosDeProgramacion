/**
 * This class defines the behavior of the controller in the arcade machine purchase system.
 * The controller coordinates the interaction between the `Maquina`, `Persona`, `Juegos`, and `Vista` classes.
 * It allows the user to choose the material of the machine, select games, and provide personal information.
 * Additionally, the controller validates user input to ensure smooth and error-free interaction.
 * 
 * Author: Melisa Maldonado Melenge cmmaldonadom@udistrital.edu.co
 * 
 * This file is part of ArcadeMachine.
 * 
 * ArcadeMachine is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either version 3 of the license,
 * or (at your option) any later version.
 * 
 * ArcadeMachine is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see 
 * <https://www.gnu.org/licenses/>.
 */
package Modelo;

/**
 * This class represents a person with attributes for storing their personal information.
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String direccion;

    /**
     * Default constructor for the Persona class.
     * Initializes a new instance of Persona with default values.
     */
    public Persona(){        
    }

    /**
     * Gets the first name of the person.
     * 
     * @return The first name of the person.
     */
    public String getNombre(){
        return nombre;
    }

     /**
     * Sets the first name of the person.
     * 
     * @param nombre The first name to set.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

     /**
     * Gets the last name of the person.
     * 
     * @return The last name of the person.
     */
    public String getApellido(){
        return apellido;
    }

      /**
     * Sets the last name of the person.
     * 
     * @param apellido The last name to set.
     */
    public void setApellido(String apellido){
        this.apellido = apellido;
    }


    /**
     * Gets the address of the person.
     * 
     * @return The address of the person.
     */
    public String getDireccion(){
        return direccion;
    }

     /**
     * Sets the address of the person.
     * 
     * @param direccion The address to set.
     */
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

}
