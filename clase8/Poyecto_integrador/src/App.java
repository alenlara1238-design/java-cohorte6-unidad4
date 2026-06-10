import repository.EventoRepository;
import service.EventoService;
import ui.Consola;

public class App {
    public static void main(String[] args) throws Exception {
        EventoRepository repo = new EventoRepository();
        EventoService servicio = new EventoService(repo);
        Consola ui = new Consola(servicio);

        ui.iniciar();
    }
}
