import java.util.List;

import model.Cancion;
import repository.CancionRepository;
import service.SpotifyService;

public class App {
    public static void main(String[] args) throws Exception {
        CancionRepository repo = new CancionRepository();
        SpotifyService service = new SpotifyService(repo);

        System.out.println("===== Spotify Demo CAPAS====\n");

        System.out.println("Servicio de canciones cortas (menor a 4 minutos");
        List<Cancion> cortas = service.obtenerCancionesCortas(240);

        cortas.forEach(c -> System.out.println(" -" + c));
        System.out.println();

        
    }
}
