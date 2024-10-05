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
 * This factory class is responsible for creating instances of various types of game machines.
 * It provides a static method to create a game machine based on the specified type and material.
 */
public class GameMachineFactory {
    
    /**
     * Creates a game machine of the specified type with the given material.
     *
     * @param type The type of the game machine to be created (e.g., "Dance Revolution", "Classical Arcade").
     * @param material The material to be used for the game machine.
     * @return A new instance of a game machine corresponding to the specified type.
     * @throws IllegalArgumentException If the specified machine type is unknown.
     */
    public static GameMachine createMachine(String type, String material) {
        switch (type) {
            case "Dance Revolution":
                return new DanceRevolution(
                    material, "5x5x7 ft", 250, 300, 16, 4, 499.99,
                    List.of(VideoGameLists.danceRevolutionGames.get(0)), // Base game
                    VideoGameLists.danceRevolutionGames, // Full list
                    new String[]{"Easy", "Medium", "Hard"}, // Difficulties
                    4, // Arrow cardinalities
                    49.99 // Difficulty multiplier
                );
            case "Classical Arcade":
                return new ClassicalArcade(
                    material, "4x3x6 ft", 200, 200, 8, 2, 299.99,
                    List.of(VideoGameLists.classicalArcadeGames.get(0)), // Base game
                    VideoGameLists.classicalArcadeGames // Full list
                );
            case "Virtual Reality":
                return new VirtualReality(
                    material, "6x6x7 ft", 300, 400, 32, 6, 999.99,
                    List.of(VideoGameLists.virtualRealityGames.get(0)), // Base game
                    VideoGameLists.virtualRealityGames, // Full list
                    "OLED", "4K", 199.99 // Glasses type, resolution, and price
                );
            case "Shooting Machine":
                return new ShootingMachine(
                    material, "4x4x6 ft", 150, 150, 8, 2, 199.99,
                    List.of(VideoGameLists.shootingGames.get(0)), // Base game
                    VideoGameLists.shootingGames, // Full list
                    "Light Gun", 50 // Gun type and ammo count
                );
            case "Racing Machine":
                return new RacingMachine(
                    material, "5x4x5 ft", 220, 250, 16, 4, 399.99,
                    List.of(VideoGameLists.racingGames.get(0)), // Base game
                    VideoGameLists.racingGames, // Full list
                    "Standard Wheel", true // Steering wheel type and gear shift
                );
            default:
                throw new IllegalArgumentException("Unknown machine type: " + type);
        }
    }
}
