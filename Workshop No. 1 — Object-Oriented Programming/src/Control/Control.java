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

import Modelo.Juegos;
import Modelo.Maquina;
import Modelo.Persona;
import Vista.Vista;

public class Control {

    Maquina maquina;
    Persona comprador;
    Juegos juego;
    Vista vista;

/**
 * Constructor for the Control class.
 * Initializes the view, machine, and buyer, and then starts the initial menu validation.
 */
    public Control() {
        vista = new Vista();
        maquina = new Maquina();
        comprador = new Persona();
        validacionMenuInicial(vista.menuInicial());
    }

/**
 * Validates the response from the initial menu.
 * 
 * @param rta User's input as a string.
 * If the response is '0', the program exits.
 * If the response is '1', it proceeds to the material selection menu.
 * If the response is invalid, an exception is caught and the user is prompted to try again.
 */
    public void validacionMenuInicial(String rta) {
        try {
            int respuestaMenuInicial = Integer.parseInt(rta);
            if (respuestaMenuInicial == 0) {
                System.out.println("\nByeee \n");
                System.exit(0);

            } else {
                if (respuestaMenuInicial == 1) {
                    validacionMenuMaterial(vista.menuMaterial());
                } else {
                    throw new Exception();
                }
            }
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            validacionMenuInicial(vista.menuInicial());
        } catch (Exception ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser 1 o 0 \n");
            validacionMenuInicial(vista.menuInicial());
        }
    }

/**
 * Validates the selection of the machine's material.
 * 
 * @param rta User's input as a string.
 * Depending on the input, a specific material is assigned to the machine. If the response is '0', it returns to the initial menu.
 * If the input is invalid, the user is prompted to enter a valid option.
 */
    public void validacionMenuMaterial(String rta) {
        try {
            int respuestaMenuMaterial = Integer.parseInt(rta);
            if (respuestaMenuMaterial == 0) {
                vista.mostrarMensaje("\nVolviendo... \n");
                validacionMenuInicial(vista.menuInicial());
            } else {
                if (respuestaMenuMaterial == 1) {
                    maquina.setMaterial("Madera");
                } else {
                    if (respuestaMenuMaterial == 2) {
                        maquina.setMaterial("Aluminio");
                    } else {
                        if (respuestaMenuMaterial == 3) {
                            maquina.setMaterial("Fibra de carbono");
                        } else {
                            throw new Exception();
                        }
                    }
                }
            }
            validacionMenuJuegos(vista.menuJuego());
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            validacionMenuMaterial(vista.menuMaterial());
        } catch (Exception e) {
            vista.mostrarMensaje("\nLa respuesta debe ser un entero entero entre 0 y 3 \n");
            validacionMenuMaterial(vista.menuMaterial());
        }
    }

/**
 * Validates the game selection for the arcade machine.
 * 
 * @param rta User's input as a string.
 * Based on the number entered, a game is added to the machine's game list.
 * If the user selects '20', it prompts for the buyer's name. If '21' is selected, the game list is reset.
 * 
 * Exceptions are handled if the response is not a number or is outside the allowed range.
 */
    public void validacionMenuJuegos(String rta) {
        try {
            int respuestaMenuJuego = Integer.parseInt(rta);
            switch (respuestaMenuJuego) {
                case 1:
                    maquina.anadirJuegos(juego.PAC_MAN);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 2:
                    maquina.anadirJuegos(juego.SPACE_INVADERS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 3:
                    maquina.anadirJuegos(juego.DONKEY_KONG);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 4:
                    maquina.anadirJuegos(juego.STREET_FIGHTER_II);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 5:
                    maquina.anadirJuegos(juego.GALAGA);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 6:
                    maquina.anadirJuegos(juego.MORTAL_KOMBAT);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 7:
                    maquina.anadirJuegos(juego.ASTEROIDS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 8:
                    maquina.anadirJuegos(juego.FROGGER);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 9:
                    maquina.anadirJuegos(juego.TETRIS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 10:
                    maquina.anadirJuegos(juego.CENTIPEDE);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 11:
                    maquina.anadirJuegos(juego.DOUBLE_DRAGON);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 12:
                    maquina.anadirJuegos(juego.DEFENDER);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 13:
                    maquina.anadirJuegos(juego.OUT_RUN);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 14:
                    maquina.anadirJuegos(juego.NBA_JAM);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 15:
                    maquina.anadirJuegos(juego.METAL_SLUG);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 16:
                    maquina.anadirJuegos(juego.TEENAGE_MUTANT_NINJA_TURTLES);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 17:
                    maquina.anadirJuegos(juego.X_MEN);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 18:
                    maquina.anadirJuegos(juego.THE_SIMPSONS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 19:
                    maquina.anadirJuegos(juego.TIME_CRISIS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 20:
                    setNombreComprador(vista.nombrePersona());
                    break;
                case 21:
                    maquina.reiniciarListaDeJuegos();
                    vista.mostrarMensaje("\nVolviendo... \n");
                    validacionMenuMaterial(vista.menuMaterial());
                    break;
            }
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            validacionMenuJuegos(vista.menuJuego());
        } catch (Exception e) {
            vista.mostrarMensaje("\nLa respuesta debe ser un entero entero entre 0 y 21 \n");
            validacionMenuJuegos(vista.menuJuego());
        }
    }

/**
 * Sets the buyer's first name.
 * @param nombrePersona The first name provided by the user.
 * After setting the first name, the method prompts the user for the last name.
 */
    public void setNombreComprador(String nombrePersona) {
        comprador.setNombre(nombrePersona);
        setApellidoComprador(vista.apellidoPersona());
    }

/**
 * Sets the buyer's last name.
 * @param apellidoPersona The last name provided by the user.
 * After setting the last name, the method prompts the user for the address.
 */
    public void setApellidoComprador(String apellidoPersona) {
        comprador.setApellido(apellidoPersona);
        setDireccion(vista.direccionPersona());
    }

/**
 * Sets the buyer's address.
 * @param direccion The address provided by the user.
 * Once the address is set, the method displays a message to verify the order 
 * and calls the method to show the full order details.
 */
    public void setDireccion(String direccion) {
        comprador.setDireccion(direccion);
        vista.mostrarMensaje(
                "\nVerifique la informacion de su pedido y digite 1 para confirmar y acabar la ejecucion del programa\n");
        mostrarPedido();
    }

/**
 * Prints the list of games added to the machine.
 * Iterates over the list of games and displays each one.
 */
    public void imprimirJuegos() {
        for (int i = 0; i < maquina.getJuegos().size(); i++) {
            vista.mostrarJuegos(maquina.getJuegos().get(i));
        }
    }

/**
 * Displays the full order details, including the machine's material, 
 * the list of selected games, and the buyer's information (name, last name, address).
 * After displaying the details, it calls the method to confirm the order.
 */
    public void mostrarPedido() {
        maquina.setComprador(comprador);
        vista.mostrarMensaje(maquina.getMaterial());
        imprimirJuegos();
        vista.mostrarMensaje(maquina.getComprador().getNombre());
        vista.mostrarMensaje(maquina.getComprador().getApellido());
        vista.mostrarMensaje(maquina.getComprador().getDireccion() + "\n");
        confirmacionPedido(vista.confirmacionPedido());
    }

 /**
 * Confirms the order based on the user's input.
 * @param confirmacion The response from the user to confirm the order.
 * If the input is 1, the order is confirmed and the program exits.
 * If the input is invalid, an error message is displayed, and the confirmation is requested again.
 */
    public void confirmacionPedido(String confirmacion) {
        try {
            int rta = Integer.parseInt(confirmacion);
            if (rta == 1) {
                vista.mostrarMensaje("\nPedido confirmado");
                System.exit(0);
            } else {
                throw new Exception();
            }
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            confirmacionPedido(vista.confirmacionPedido());
        } catch (Exception e) {
            vista.mostrarMensaje("\nLa respuesta debe ser 1 \n");
            confirmacionPedido(vista.confirmacionPedido());
        }
    }
}
