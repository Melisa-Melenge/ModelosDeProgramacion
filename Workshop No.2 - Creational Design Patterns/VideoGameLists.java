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
 * This class contains predefined lists of video games categorized by type.
 * Each list includes various video games with attributes such as name, price,
 * description, and creators.
 */
public class VideoGameLists {
    /**
     * List of Dance Revolution video games.
     */
    public static final List<VideoGame> danceRevolutionGames = List.of(
        new VideoGame("Dance Game 1", 19.99, "Juego de baile fácil para principiantes.", "Creator A", "Graphics A", "Music", 2021),
        new VideoGame("Dance Game 2", 29.99, "Juego de baile intermedio con más desafíos.", "Creator B", "Graphics B", "Music", 2020),
        new VideoGame("Dance Game 3", 39.99, "Juego de baile avanzado con niveles complejos.", "Creator C", "Graphics C", "Music", 2019),
        new VideoGame("Dance Game 4", 49.99, "Juego de baile multijugador.", "Creator D", "Graphics D", "Music", 2022),
        new VideoGame("Dance Game 5", 59.99, "Juego de baile con música popular.", "Creator E", "Graphics E", "Music", 2023)
    );

    /**
     * List of Classical Arcade video games.
     */
    public static final List<VideoGame> classicalArcadeGames = List.of(
        new VideoGame("Classic Arcade Game 1", 15.99, "Clásico juego de arcade.", "Creator F", "Graphics F", "Arcade", 1980),
        new VideoGame("Classic Arcade Game 2", 17.99, "Defiende la tierra de los invasores espaciales.", "Creator G", "Graphics G", "Arcade", 1980),
        new VideoGame("Classic Arcade Game 3", 20.99, "Ayuda a Mario a rescatar a la princesa.", "Creator H", "Graphics H", "Platform", 1981),
        new VideoGame("Classic Arcade Game 4", 22.99, "Juego de naves espaciales clásico.", "Creator I", "Graphics I", "Arcade", 1981),
        new VideoGame("Classic Arcade Game 5", 24.99, "Ayuda a la rana a cruzar la carretera.", "Creator J", "Graphics J", "Arcade", 1981)
    );

    /**
     * List of Virtual Reality video games.
     */
    public static final List<VideoGame> virtualRealityGames = List.of(
        new VideoGame("VR Adventure Game 1", 49.99, "Aventura inmersiva en un mundo virtual.", "Creator K", "Graphics K", "Adventure", 2022),
        new VideoGame("VR Racing Game 1", 59.99, "Carrera de alta velocidad en realidad virtual.", "Creator L", "Graphics L", "Racing", 2023),
        new VideoGame("VR Shooter Game 1", 54.99, "Disparos en primera persona con gafas VR.", "Creator M", "Graphics M", "Shooter", 2021),
        new VideoGame("VR Exploration Game 1", 39.99, "Explora mundos abiertos en realidad virtual.", "Creator N", "Graphics N", "Exploration", 2020),
        new VideoGame("VR Space Battle Game 1", 64.99, "Batalla en el espacio en realidad virtual.", "Creator O", "Graphics O", "Action", 2023)
    );

    /**
     * List of Shooting video games.
     */
    public static final List<VideoGame> shootingGames = List.of(
        new VideoGame("Shooting Game 1", 25.99, "Juego de disparos con varios niveles.", "Creator P", "Graphics P", "Shooter", 2018),
        new VideoGame("Shooting Game 2", 29.99, "Defiende tu territorio de los invasores.", "Creator Q", "Graphics Q", "Shooter", 2019),
        new VideoGame("Shooting Game 3", 34.99, "Sobrevive al ataque de los zombis.", "Creator R", "Graphics R", "Horror", 2020),
        new VideoGame("Shooting Game 4", 39.99, "Juego de francotiradores con alta precisión.", "Creator S", "Graphics S", "Shooter", 2021),
        new VideoGame("Shooting Game 5", 44.99, "Dispara a los alienígenas y salva la tierra.", "Creator T", "Graphics T", "Sci-Fi", 2022)
    );

    /**
     * List of Racing video games.
     */
    public static final List<VideoGame> racingGames = List.of(
        new VideoGame("Racing Game 1", 29.99, "Carreras con varios tipos de vehículos.", "Creator U", "Graphics U", "Racing", 2019),
        new VideoGame("Racing Game 2", 34.99, "Compite en pistas fuera de carretera.", "Creator V", "Graphics V", "Racing", 2020),
        new VideoGame("Racing Game 3", 49.99, "Juego de carreras de alta velocidad.", "Creator W", "Graphics W", "Racing", 2021),
        new VideoGame("Racing Game 4", 39.99, "Carreras callejeras nocturnas.", "Creator X", "Graphics X", "Racing", 2022),
        new VideoGame("Racing Game 5", 44.99, "Conduce en caminos de tierra y nieve.", "Creator Y", "Graphics Y", "Rally", 2023)
    );
}
