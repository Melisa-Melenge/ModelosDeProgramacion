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

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents a machine that can be customized with a material and a list of games.
 * It also stores information about the buyer (comprador).
 */
public class Maquina {

    private String material;
    private List<Juegos> juegos = new ArrayList<>(); 
    private Persona comprador;

     /**
     * Default constructor for the Maquina class.
     * Initializes an empty machine object.
     */
    public Maquina(){
    }

      /**
     * Retrieves the material of the machine.
     * 
     * @return The material of the machine as a string.
     */
    public String getMaterial(){
        return material;
    }

    /**
     * Sets the material of the machine.
     * 
     * @param material The material to be set for the machine.
     */
    public void setMaterial(String material){
        this.material = material;
    }

      /**
     * Adds a game to the list of games installed on the machine.
     * 
     * @param juego The game to be added to the machine.
     */
    public void anadirJuegos(Juegos juego){
        juegos.add(juego);
    }

    /**
     * Clears the list of games installed on the machine.
     * This can be used to reset the machine to its default state without any games.
     */
    public void reiniciarListaDeJuegos(){
        juegos.clear();
    }

     /**
     * Retrieves the buyer (comprador) associated with the machine.
     * 
     * @return The buyer (Persona) object.
     */
    public Persona getComprador() {
        return comprador;
    }

    /**
     * Sets the buyer (comprador) of the machine.
     * 
     * @param comprador The Persona object representing the buyer.
     */
    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    /**
     * Retrieves the list of games installed on the machine.
     * 
     * @return A list of games installed on the machine.
     */
    public List<Juegos> getJuegos() {
        return juegos;
    }

     /**
     * Sets the list of games for the machine.
     * This method can be used to replace the existing list of games.
     * 
     * @param juegos The list of games to be set for the machine.
     */
    public void setJuegos(List<Juegos> juegos) {
        this.juegos = juegos;
    }
    
}
