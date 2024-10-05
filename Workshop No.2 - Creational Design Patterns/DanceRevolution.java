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
 * This class represents a Dance Revolution game machine, which can be customized with specific attributes
 * such as difficulties, arrow cardinalities, and control pricing. It extends the base GameMachine class.
 */
public class DanceRevolution extends GameMachine {
    private String[] difficulties; // Difficulty levels
    private int arrowCardinalities; // Arrow cardinalities
    private double controlsPrice; // Price of the controls
    private double difficultyMultiplier; // Difficulty multiplier

    /**
     * Constructor for the DanceRevolution class.
     * Initializes a new instance of the Dance Revolution machine with the specified attributes.
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
     * @param difficulties An array of difficulty levels for the Dance Revolution machine.
     * @param arrowCardinalities The number of arrow cardinalities for the Dance Revolution machine.
     * @param difficultyMultiplier The multiplier for difficulty levels affecting gameplay.
     */
    public DanceRevolution(String material, String dimensions, double weight, double powerConsumption,
                           int memory, int processors, double basePrice, List<VideoGame> videoGames,
                           List<VideoGame> availableVideoGames, String[] difficulties, int arrowCardinalities, double difficultyMultiplier) {
        super(material, dimensions, weight, powerConsumption, memory, processors, basePrice, videoGames, availableVideoGames);
        this.difficulties = difficulties;
        this.arrowCardinalities = arrowCardinalities; // Assigns the number of arrow cardinalities
        this.difficultyMultiplier = difficultyMultiplier; // Assigns the difficulty multiplier
        this.controlsPrice = 0; // Initializes the price of the controls
    }

    /**
     * Retrieves the available difficulty levels for the Dance Revolution machine.
     * 
     * @return An array of difficulty levels.
     */
    public String[] getDifficulties() {
        return difficulties;
    }

    /**
     * Retrieves the number of arrow cardinalities for the Dance Revolution machine.
     * 
     * @return The number of arrow cardinalities.
     */
    public int getArrowCardinalities() {
        return arrowCardinalities;
    }

    /**
     * Retrieves the price of the controls for the Dance Revolution machine.
     * 
     * @return The price of the controls.
     */
    public double getControlsPrice() {
        return controlsPrice;
    }

    /**
     * Retrieves the difficulty multiplier for the Dance Revolution machine.
     * 
     * @return The difficulty multiplier.
     */
    public double getDifficultyMultiplier() {
        return difficultyMultiplier;
    }

    /**
     * Displays detailed information about the Dance Revolution machine.
     * Shows the machine's attributes, including material, dimensions, weight, power consumption,
     * memory, processors, base price, available video games, difficulties, arrow cardinalities,
     * and control pricing.
     */
    @Override
    public void displayInfo() {
        System.out.println("Dance Revolution Machine:");
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Power Consumption: " + powerConsumption + " W");
        System.out.println("Memory: " + memory + " GB");
        System.out.println("Processors: " + processors);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Available Video Games:");
        for (VideoGame game : videoGames) {
            System.out.println("- " + game.getName() + " ($" + game.getPrice() + "): " + game.getDescription());
        }
        System.out.println("Difficulties: " + String.join(", ", difficulties));
        System.out.println("Arrow Cardinalities: " + arrowCardinalities);
        System.out.println("Controls Price: $" + controlsPrice);
    }
}
