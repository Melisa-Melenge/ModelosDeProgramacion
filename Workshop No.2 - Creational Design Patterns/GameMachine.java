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
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a base game machine that can be customized with various attributes such as material, dimensions, weight,
 * power consumption, memory, processors, and a list of video games. The machine also maintains a list of available games
 * that can be added.
 */
public class GameMachine {
    protected String material;
    protected String dimensions;
    protected double weight;
    protected double powerConsumption;
    protected int memory;
    protected int processors;
    protected double basePrice;
    protected List<VideoGame> videoGames; // Mutable list of video games installed on the machine
    protected List<VideoGame> availableVideoGames; // Mutable list of available video games
    protected String customName;

    /**
     * Constructor for the GameMachine class.
     * Initializes a new instance of the game machine with the specified attributes.
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
    public GameMachine(String material, String dimensions, double weight, double powerConsumption,
                       int memory, int processors, double basePrice, List<VideoGame> videoGames,
                       List<VideoGame> availableVideoGames) {
        this.material = material;
        this.dimensions = dimensions;
        this.weight = weight;
        this.powerConsumption = powerConsumption;
        this.memory = memory;
        this.processors = processors;
        this.basePrice = basePrice;
        this.videoGames = new ArrayList<>(videoGames); // Make the list mutable
        this.availableVideoGames = new ArrayList<>(availableVideoGames); // Make the list mutable
        this.customName = null; // Initialize the custom name as null
    }

    /**
     * Retrieves the weight of the game machine.
     *
     * @return The weight of the machine.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the game machine.
     *
     * @param weight The new weight to set for the machine.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Retrieves the base price of the game machine.
     *
     * @return The base price of the machine.
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the base price of the game machine.
     *
     * @param basePrice The new base price to set for the machine.
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * Retrieves the power consumption of the game machine.
     *
     * @return The power consumption of the machine.
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Sets the power consumption of the game machine.
     *
     * @param powerConsumption The new power consumption to set for the machine.
     */
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Sets a custom name for the game machine.
     *
     * @param customName The custom name to set for the machine.
     */
    public void setCustomName(String customName) {
        this.customName = customName;
    }

    /**
     * Retrieves the list of available video games.
     *
     * @return The list of available video games.
     */
    public List<VideoGame> getAvailableVideoGames() {
        return availableVideoGames;
    }

    /**
     * Retrieves the list of video games currently installed on the game machine.
     *
     * @return The list of video games installed on the machine.
     */
    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    /**
     * Adds a video game to the game machine.
     * If the game is not already present in the list of installed games, it is added,
     * and the base price of the machine is increased by the price of the game.
     *
     * @param game The video game to add to the machine.
     */
    public void addVideoGame(VideoGame game) {
        if (!videoGames.contains(game)) {
            videoGames.add(game);
            basePrice += game.getPrice();
        }
    }

    /**
     * Removes a video game from the game machine.
     * The game can be removed only if it is not the only game in the list, and the base price
     * of the machine is decreased by the price of the removed game.
     *
     * @param game The video game to remove from the machine.
     */
    public void removeVideoGame(VideoGame game) {
        if (videoGames.size() > 1 && videoGames.remove(game)) { // Do not allow removing the base game
            basePrice -= game.getPrice();
        }
    }

    /**
     * Displays detailed information about the game machine, including attributes such as material,
     * dimensions, weight, power consumption, memory, processors, base price, and the list of installed video games.
     * Also displays the custom name if it has been set, or "Predefined Machine" otherwise.
     */
    public void displayInfo() {
        System.out.println("Custom Game Machine Information:");
        System.out.println("Name: " + (customName != null ? customName : "Predefined Machine"));
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Power Consumption: " + powerConsumption + " W");
        System.out.println("Memory: " + memory + " GB");
        System.out.println("Processors: " + processors);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Current Video Games in the Machine:");
        for (VideoGame game : videoGames) {
            System.out.println("- " + game);
        }
    }
}
