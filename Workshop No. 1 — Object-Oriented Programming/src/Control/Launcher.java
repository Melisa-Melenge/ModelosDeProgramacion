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
package Control;

public class Launcher{
    /**
     * The main method is the starting point of the application.
     * It creates a new instance of the Control class, which handles the application's flow.
     * 
     * @param args Command-line arguments (not used in this application).
     * @throws Exception If an exception occurs during program execution.
     */
    public static void main(String[] args) throws Exception {
        new Control();
    }
}
