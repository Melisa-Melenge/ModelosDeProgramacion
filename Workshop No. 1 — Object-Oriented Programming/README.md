## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Machine Purchase Program

## Overview

This project is a simple console-based application for configuring and purchasing a machine with customizable options. The application allows users to select materials for the machine, add various classic games, and provide personal information for the purchase. The program interacts with the user through a command-line interface, guiding them through a series of menus.

## Project Structure

The project consists of several packages and classes:

- **`Control`**: Contains the `Control` class which handles the main logic and flow of the application.
- **`Modelo`**: Contains model classes such as `Juegos`, `Maquina`, and `Persona` that represent the game's data and machine details.
- **`Vista`**: Contains the `Vista` class responsible for user interaction, displaying menus, and collecting input.

### Key Classes

- **`Control`**: Manages the user interaction flow, validates user input, and handles the creation and configuration of the `Maquina` object. It also interacts with the `Vista` class for displaying information and receiving user input.

- **`Juegos`**: An enumeration representing a list of classic games available for selection.

- **`Maquina`**: Represents the machine being purchased. It holds information about the selected material, the list of games, and the buyer's details.

- **`Persona`**: Represents the buyer with attributes for their name, last name, and address.

- **`Vista`**: Provides methods for displaying menus and messages to the user and collecting input.

### Usage

1. **Launch the Program**: Run the `Launcher` class to start the application.
2. **Menu Navigation**:
   - **Initial Menu**: Choose to continue or exit.
   - **Material Selection**: Select the material for the machine.
   - **Game Selection**: Add games to the machine or return to the previous menu.
   - **Personal Information**: Provide the buyer's name, last name, and address.
3. **Order Confirmation**: Review the order details and confirm to finalize the purchase.

### Installation

To run this project, you need:
- Java Development Kit (JDK) installed on your machine.
- A compatible IDE or text editor to run and compile the code.

Clone the repository and run the `Launcher` class to start the application:

```bash
git clone <repository-url>
cd <repository-directory>

