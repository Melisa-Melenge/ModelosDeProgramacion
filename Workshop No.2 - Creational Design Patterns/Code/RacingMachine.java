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
 * This class represents a racing game machine, which is a type of game machine that includes
 * specific features for racing games, such as steering wheel type and whether it has a gear shift.
 */
public class RacingMachine extends GameMachine {
    private String steeringWheelType; // Type of steering wheel
    private boolean hasGearShift; // Indicates if it has a gear shift

    /**
     * Constructor for the RacingMachine class.
     *
     * @param material The material used for the machine.
     * @param dimensions The dimensions of the machine.
     * @param weight The weight of the machine in kilograms.
     * @param powerConsumption The power consumption of the machine in watts.
     * @param memory The memory of the machine in gigabytes.
     * @param processors The number of processors in the machine.
     * @param basePrice The base price of the machine.
     * @param videoGames The list of video games currently installed on the machine.
     * @param availableVideoGames The list of video games available for the machine.
     * @param steeringWheelType The type of steering wheel used by the machine.
     * @param hasGearShift Indicates if the machine has a gear shift (true) or not (false).
     */
    public RacingMachine(String material, String dimensions, double weight, double powerConsumption, 
                         int memory, int processors, double basePrice, List<VideoGame> videoGames, 
                         List<VideoGame> availableVideoGames, String steeringWheelType, boolean hasGearShift) {
        super(material, dimensions, weight, powerConsumption, memory, processors, basePrice, videoGames, availableVideoGames);
        this.steeringWheelType = steeringWheelType;
        this.hasGearShift = hasGearShift;
    }

    /**
     * Displays the information about the racing machine, including its specifications
     * and the available video games.
     */
    @Override
    public void displayInfo() {
        System.out.println("Racing Machine:");
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

        System.out.println("Steering Wheel Type: " + steeringWheelType);
        System.out.println("Has Gear Shift: " + (hasGearShift ? "Yes" : "No"));
    }
}
