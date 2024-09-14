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

package Vista;


import java.util.Scanner;
import Modelo.Juegos;

/**
 * This class represents the view in the application. 
 * It handles user interaction through the console, displaying messages and menus, 
 * and reading user input for various operations.
 */
public class Vista {
    
    Scanner sc = new Scanner(System.in);

    /**
     * Constructor for the Vista class.
     * Initializes the view with no specific setup.
     */
    public Vista(){   
    }
    
    /**
     * Displays a selected game to the console.
     * 
     * @param juegos The game to be displayed.
     */
    public void mostrarJuegos(Juegos juegos){
        System.out.println(juegos);
    }

      /**
     * Displays a message to the console.
     * 
     * @param mensaje The message to be displayed.
     */
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

      /**
     * Displays the initial menu and prompts the user to continue or exit.
     * 
     * @return The user's input as a string.
     */
    public String menuInicial(){
        System.out.println("Bienvenido al programa de compra de maquinas, presione 1 para continuar o 0 para acabar con la ejecucion \n");
        return sc.nextLine();
    }
    
    /**
     * Displays the material selection menu and prompts the user for input.
     * 
     * @return The user's input as a string.
     */
    public String menuMaterial(){
        System.out.println("\nEscoja el material que quiere para la maquina: \n 1) Madera \n 2) Aluminio \n 3) Fibra de carbono \n 0) Para devolverse al menu anterior \n");
        return sc.nextLine();  
    }


    /**
     * Displays the game selection menu and prompts the user to choose a game.
     * 
     * @return The user's input as a string.
     */
    public String menuJuego(){
        System.out.println("\nEscoja el juego que quiere para instalar a la maquina: \n\n1) Pac-Man (1980)\r\n" + //
                        "2) Space Invaders (1978)\r\n" + //
                        "3) Donkey Kong (1981)\r\n" + //
                        "4) Street Fighter II (1991)\r\n" + //
                        "5) Galaga (1981)\r\n" + //
                        "6) Mortal Kombat (1992)\r\n" + //
                        "7) Asteroids (1979)\r\n" + //
                        "8) Frogger (1981)\r\n" + //
                        "9) Tetris (1984)\r\n" + //
                        "10) Centipede (1980)\r\n" + //
                        "11) Double Dragon (1987)\r\n" + //
                        "12) Defender (1981)\r\n" + //
                        "13) Out Run (1986)\r\n" + //
                        "14) NBA Jam (1993)\r\n" + //
                        "15) Metal Slug (1996)\r\n" + //
                        "16) Teenage Mutant Ninja Turtles (1989)\r\n" + //
                        "17) X-Men (1992)\r\n" + //
                        "18) The Simpsons (1991)\r\n" + //
                        "19) Time Crisis (1995)\r\n" + //
                        "20) Dejar de agregar juegos\r\n" + //
                        "21) Volver al menu anterior\n");
                        return sc.nextLine();
    }

     /**
     * Prompts the user to enter the name of the person placing the order.
     * 
     * @return The user's input as a string.
     */
    public String nombrePersona(){
        System.out.println("\nEscriba el nombre de la persona que va a realizar el pedido\n");
        return sc.nextLine();
    }

   /**
     * Prompts the user to enter the surname of the person placing the order.
     * 
     * @return The user's input as a string.
     */
    public String apellidoPersona(){
        System.out.println("\nEscriba el apellido de la persona que va a realizar el pedido\n");
        return sc.nextLine();
    }

    /**
     * Prompts the user to enter the delivery address for the order.
     * 
     * @return The user's input as a string.
     */
    public String direccionPersona(){
        System.out.println("\nEscriba la direccion a la cual debe llegar el pedido\n");
        return sc.nextLine();
    }

    /**
     * Prompts the user to confirm the order.
     * 
     * @return The user's input as a string.
     */
    public String confirmacionPedido(){
        return sc.nextLine();
    }
    
}
