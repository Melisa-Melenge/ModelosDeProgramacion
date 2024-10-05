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

public class VirtualReality extends GameMachine {
    private String glassesType;
    private String glassesResolution;
    private double glassesPrice;

    /**
     * Constructs a VirtualReality machine with specified attributes.
     *
     * @param material The material of the machine.
     * @param dimensions The dimensions of the machine.
     * @param weight The weight of the machine.
     * @param powerConsumption The power consumption of the machine.
     * @param memory The memory capacity of the machine.
     * @param processors The number of processors.
     * @param basePrice The base price of the machine.
     * @param videoGames The list of video games currently in the machine.
     * @param availableVideoGames The list of available video games.
     * @param glassesType The type of glasses used with the machine.
     * @param glassesResolution The resolution of the glasses.
     * @param glassesPrice The price of the glasses.
     */
    public VirtualReality(String material, String dimensions, double weight, double powerConsumption,
                          int memory, int processors, double basePrice, List<VideoGame> videoGames,
                          List<VideoGame> availableVideoGames, String glassesType, String glassesResolution, double glassesPrice) {
        super(material, dimensions, weight, powerConsumption, memory, processors, basePrice, videoGames, availableVideoGames);
        this.glassesType = glassesType;
        this.glassesResolution = glassesResolution;
        this.glassesPrice = glassesPrice;
    }

    /**
     * Displays the information of the Virtual Reality machine, including its specifications and available video games.
     */
    @Override
    public void displayInfo() {
        System.out.println("Virtual Reality Machine:");
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Power Consumption: " + powerConsumption + " W");
        System.out.println("Memory: " + memory + " GB");
        System.out.println("Processors: " + processors);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Available Video Games:");

        if (videoGames.isEmpty()) {
            System.out.println("No available video games.");
        } else {
            for (VideoGame game : videoGames) {
                System.out.println("- " + game.getName() + " ($" + game.getPrice() + "): " + game.getDescription());
            }
        }

        System.out.println("Glasses Type: " + glassesType);
        System.out.println("Glasses Resolution: " + glassesResolution);
        System.out.println("Glasses Price: $" + glassesPrice);
    }
}
