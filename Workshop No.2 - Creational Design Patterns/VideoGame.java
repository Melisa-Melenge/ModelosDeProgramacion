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
/**
 * This class represents a video game with various attributes such as name, price,
 * description, creators, category, and release year.
 */
public class VideoGame {
    private String name;               
    private double price;             
    private String description;         
    private String storytellingCreator; 
    private String graphicsCreator;     
    private String category;           
    private int year;                   

    /**
     * Constructor for the VideoGame class.
     *
     * @param name The name of the video game.
     * @param price The base price of the video game.
     * @param description A brief description of the video game.
     * @param storytellingCreator The creator of the narrative.
     * @param graphicsCreator The creator of the graphics.
     * @param category The category of the video game.
     * @param year The year the video game was released.
     */
    public VideoGame(String name, double price, String description, String storytellingCreator, 
                     String graphicsCreator, String category, int year) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.storytellingCreator = storytellingCreator;
        this.graphicsCreator = graphicsCreator;
        this.category = category;
        this.year = year;
    }

    // Getters for the video game attributes

    /**
     * Gets the name of the video game.
     *
     * @return The name of the video game.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the base price of the video game.
     *
     * @return The base price of the video game.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the description of the video game.
     *
     * @return The description of the video game.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the creator of the narrative.
     *
     * @return The creator of the narrative.
     */
    public String getStorytellingCreator() {
        return storytellingCreator;
    }

    /**
     * Gets the creator of the graphics.
     *
     * @return The creator of the graphics.
     */
    public String getGraphicsCreator() {
        return graphicsCreator;
    }

    /**
     * Gets the category of the video game.
     *
     * @return The category of the video game.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the year the video game was released.
     *
     * @return The year of release.
     */
    public int getYear() {
        return year;
    }

    /**
     * Calculates the price of the video game if it is selected in high definition.
     * 
     * @return The price with a 10% increase for high definition.
     */
    public double getPriceWithHD() {
        return price * 1.10; // Increases the price by 10% for high definition
    }

    /**
     * Returns a string representation of the video game.
     *
     * @return A string representation of the video game, including its attributes.
     */
    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", storytellingCreator='" + storytellingCreator + '\'' +
                ", graphicsCreator='" + graphicsCreator + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }
}


