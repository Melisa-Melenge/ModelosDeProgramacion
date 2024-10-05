/**
 * This file has class for a VideoGameMachineApp.
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

 import java.util.List;

 /**
  * This class represents a classical arcade machine that can be customized with a material and a list of video games.
  * It extends the base GameMachine class and adds specific functionalities for the classical arcade machine.
  */
 public class ClassicalArcade extends GameMachine {
 
     /**
      * Constructor for the ClassicalArcade class.
      * Initializes a new instance of the classical arcade machine with the specified attributes.
      * 
      * @param material The material of the machine.
      * @param dimensions The dimensions of the machine.
      * @param weight The weight of the machine.
      * @param powerConsumption The power consumption of the machine.
      * @param memory The memory of the machine in GB.
      * @param processors The number of processors of the machine.
      * @param basePrice The base price of the machine.
      * @param videoGames The list of video games installed on the machine.
      * @param availableVideoGames The list of available video games to add.
      */
     public ClassicalArcade(String material, String dimensions, double weight, double powerConsumption, 
                            int memory, int processors, double basePrice, List<VideoGame> videoGames,
                            List<VideoGame> availableVideoGames) {
         super(material, dimensions, weight, powerConsumption, memory, processors, basePrice, videoGames, availableVideoGames);
     }
 
     /**
      * Method to activate the vibration of the machine.
      * Prints a message indicating that the vibration has been activated.
      */
     public void makeVibration() {
         System.out.println("Vibration activated!");
     }
 
     /**
      * Method to alert the user about sound recording.
      * Prints an alert message indicating that sound recording is in progress.
      */
     public void soundRecordAlert() {
         System.out.println("Sound recording alert!");
     }
 
     /**
      * Method to display detailed information about the classical arcade machine.
      * Shows the machine's attributes, including material, dimensions, weight, power consumption,
      * memory, processors, base price, and available video games.
      */
     @Override
     public void displayInfo() {
         System.out.println("Classical Arcade Machine:");
         System.out.println("Material: " + material);
         System.out.println("Dimensions: " + dimensions);
         System.out.println("Weight: " + weight + " kg");
         System.out.println("Power Consumption: " + powerConsumption + " W");
         System.out.println("Memory: " + memory + " GB");
         System.out.println("Processors: " + processors);
         System.out.println("Base Price: $" + basePrice);
         System.out.println("Available Video Games:");
         
         if (videoGames.isEmpty()) {
             System.out.println("No video games available.");
         } else {
             for (VideoGame game : videoGames) {
                 System.out.println("- " + game.getName() + " ($" + game.getPrice() + "): " + game.getDescription());
             }
         }
     }
 }
 
