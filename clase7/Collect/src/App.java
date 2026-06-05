import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<VideoJuego> juegos = List.of(
                new VideoJuego("The Legend of Zelda: Breath of the Wild", 59.99, "Aventura"),
                new VideoJuego("Super Mario Odyssey", 49.99, "Plataformas"),
                new VideoJuego("Red Dead Redemption 2", 69.99, "Acción/Aventura"),
                new VideoJuego("Minecraft", 26.95, "Sandbox"),
                new VideoJuego("The Witcher 3: Wild Hunt", 39.99, "RPG"),
                new VideoJuego("Fortnite", 0.00, "Battle Royale"),
                new VideoJuego("Call of Duty: Warzone", 0.00, "Battle Royale"),
                new VideoJuego("Among Us", 4.99, "Multijugador"),
                new VideoJuego("Cyberpunk 2077", 59.99, "RPG"),
                new VideoJuego("Animal Crossing: New Horizons", 59.99, "Simulación"),
                new VideoJuego("Hades", 24.99, "Roguelike"),
                new VideoJuego("Apex Legends", 0.00, "Battle Royale"),
                new VideoJuego("Genshin Impact", 0.00, "RPG"),
                new VideoJuego("Valorant", 0.00, "FPS"),
                new VideoJuego("League of Legends", 0.00, "MOBA"),
                new VideoJuego("Overwatch", 39.99, "FPS"),
                new VideoJuego("Doom Eternal", 59.99, "FPS"),
                new VideoJuego("Hollow Knight", 14.99, "Metroidvania"),
                new VideoJuego("Dark Souls III", 59.99, "RPG"));

        // toList: para recolectar en una lista
        List<VideoJuego> resultado = juegos.stream()
                .filter(j -> j.getPrecio() == 0)
                .toList();

        System.out.println(resultado);

        System.out.println("generos unicos: Set");
        // toSet: evita duplicados porque el resultado es un Set (conjunto)
        Set<String> generosUnicos = juegos.stream()
                .map(VideoJuego::getGenero)
                .collect(Collectors.toSet());

        System.out.println(generosUnicos);

        // toMap
        var mapaPorNombre = juegos.stream()
                .collect(Collectors.toMap(
                        j -> j.getNombre(),
                        j -> j.getPrecio()));

        System.out.println("\n\nResultado Map");
        var result = mapaPorNombre.get("Fortnite");
        System.out.println(result);

        Map<String, List<VideoJuego>> juegosPorGenero = juegos.stream()
                .collect(Collectors.groupingBy(VideoJuego::getGenero));

        System.out.println("\n\nImprimiendo Map");
        juegosPorGenero.forEach((genero, lista) -> {
            System.out.println("\n\nGénero: " + genero + ": ");
            lista.forEach(v -> System.out.println(v.getNombre()));
        });

    }
}
