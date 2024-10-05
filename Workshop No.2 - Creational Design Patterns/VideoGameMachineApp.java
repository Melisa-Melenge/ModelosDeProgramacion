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
import java.util.Scanner;

public class VideoGameMachineApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameMachineFactory factory = new GameMachineFactory();

        // Menu to select the type of machine
        System.out.println("Select the type of machine:");
        System.out.println("1. Dance Revolution");
        System.out.println("2. Classical Arcade");
        System.out.println("3. Virtual Reality");
        System.out.println("4. Shooting Machine");
        System.out.println("5. Racing Machine");
        int machineChoice = scanner.nextInt();
        scanner.nextLine(); 

        String machineType = switch (machineChoice) {
            case 1 -> "Dance Revolution";
            case 2 -> "Classical Arcade";
            case 3 -> "Virtual Reality";
            case 4 -> "Shooting Machine";
            case 5 -> "Racing Machine";
            default -> throw new IllegalArgumentException("Invalid selection");
        };

        // Menu to select the type of material
        System.out.println("Select the material of the machine:");
        System.out.println("1. Wood");
        System.out.println("2. Aluminum");
        System.out.println("3. Carbon fiber");
        int materialChoice = scanner.nextInt();
        scanner.nextLine(); 

        String material = switch (materialChoice) {
            case 1 -> "Wood";
            case 2 -> "Aluminum";
            case 3 -> "Carbon fiber";
            default -> throw new IllegalArgumentException("Invalid selection");
        };

        GameMachine machine = factory.createMachine(machineType, material);
        adjustMachineAttributes(machine, material);
        double originalPrice = machine.getBasePrice();

        System.out.println("Enter the name of your customized machine:");
        String customName = scanner.nextLine();
        machine.setCustomName(customName);

        boolean continueManaging = true;
        while (continueManaging) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a video game");
            System.out.println("2. Remove a video game");
            System.out.println("3. Exit");
            int actionChoice = scanner.nextInt();
            scanner.nextLine(); 

            switch (actionChoice) {
                case 1 -> {
                    System.out.println("Select a video game to add:");
                    List<VideoGame> availableGames = machine.getAvailableVideoGames();
                    for (int i = 1; i < availableGames.size(); i++) { 
                        VideoGame game = availableGames.get(i);
                        System.out.println((i + 1) + ". " + game.getName() + " - " + game.getDescription() + " - " + game.getYear() + " - $" + game.getPrice());
                    }
                    int gameChoice = scanner.nextInt() - 1;
                    scanner.nextLine(); 

                    if (gameChoice >= 1 && gameChoice < availableGames.size()) {
                        VideoGame selectedGame = availableGames.get(gameChoice);
                        System.out.println("Would you like to add the video game in standard or high quality?");
                        System.out.println("1. Standard");
                        System.out.println("2. High (+10% of the price)");
                        int qualityChoice = scanner.nextInt();
                        scanner.nextLine(); 

                        if (qualityChoice == 2) {
                            double increase = machine.getBasePrice() * 0.10;
                            machine.setBasePrice(machine.getBasePrice() + increase);
                        }

                        machine.addVideoGame(selectedGame);
                        machine.getAvailableVideoGames().remove(selectedGame); 
                        System.out.println("Video game added.");
                    } else {
                        System.out.println("Invalid selection.");
                    }
                }
                case 2 -> {
                    System.out.println("Select a video game to remove (except the base game):");
                    List<VideoGame> currentGames = machine.getVideoGames();
                    for (int i = 1; i < currentGames.size(); i++) { 
                        VideoGame game = currentGames.get(i);
                        System.out.println((i + 1) + ". " + game.getName());
                    }
                    int gameChoice = scanner.nextInt() - 1;
                    scanner.nextLine(); 

                    if (gameChoice > 0 && gameChoice < currentGames.size()) {
                        VideoGame removedGame = currentGames.get(gameChoice);
                        machine.removeVideoGame(removedGame);
                        machine.getAvailableVideoGames().add(removedGame); 
                        System.out.println("Video game removed.");
                    } else {
                        System.out.println("Invalid selection.");
                    }
                }
                case 3 -> continueManaging = false;
                default -> System.out.println("Invalid selection.");
            }
        }

        System.out.println("Enter your name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter your delivery address:");
        String address = scanner.nextLine();
        System.out.println("Enter your phone number:");
        String phone = scanner.nextLine();

        System.out.println("\n=== Purchase Confirmation ===");
        System.out.println("Name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Machine Type: " + machineType);
        System.out.println("Material: " + material);
        System.out.println("Original machine value: $" + originalPrice);
        System.out.println("Added video games:");
        for (VideoGame game : machine.getVideoGames()) {
            System.out.println("- " + game.getName());
        }
        System.out.println("Final machine price: $" + machine.getBasePrice());
    }

    /**
     * Adjusts the attributes of the machine based on the selected material.
     * 
     * @param machine The game machine to adjust.
     * @param material The material selected for the machine.
     */
    private static void adjustMachineAttributes(GameMachine machine, String material) {
        switch (material) {
            case "Wood":
                machine.setWeight(machine.getWeight() * 1.10); 
                machine.setBasePrice(machine.getBasePrice() * 0.95); 
                machine.setPowerConsumption(machine.getPowerConsumption() * 1.15); 
                break;
            case "Aluminum":
                machine.setWeight(machine.getWeight() * 0.95); 
                machine.setBasePrice(machine.getBasePrice() * 1.10); 
                break;
            case "Carbon fiber":
                machine.setWeight(machine.getWeight() * 0.85); 
                machine.setBasePrice(machine.getBasePrice() * 1.20); 
                machine.setPowerConsumption(machine.getPowerConsumption() * 0.90); 
                break;
            default:
                throw new IllegalArgumentException("Unknown material");
        }
    }
}




