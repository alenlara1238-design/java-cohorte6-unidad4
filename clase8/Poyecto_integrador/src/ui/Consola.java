package ui;

import java.util.List;
import java.util.Scanner;

import model.Evento;
import service.EventoService;

public class Consola {
    private Scanner sc = new Scanner(System.in);

    private EventoService servicio;

    public Consola(EventoService servicio) {
        this.servicio = servicio;
    }

    public void iniciar(){
        int opcion;

        do{
            System.out.println("""
                    ========= PLATAFORMA DE EVENTOS =========

                1. Listar eventos
                2. Eventos gratuitos
                3. Eventos con cupos
                4. Buscar por categoría
                5. Buscar por ciudad
                6. Categorías disponibles
                7. Ciudades disponibles
                8. Nombre -> Precio
                9. Agrupar por categoría
                0. Salir
                    """);
                System.out.print("Seleccione na opcion:");
                opcion = sc.nextInt();

                sc.nextLine();

                switch (opcion) {
                    case 1:
                            listar(servicio.listarEventos());
                        break;
                    case 2:
                        listar(servicio.eventosGratuitos());
                        break;
                    default:
                        break;
                }

        }while(opcion != 0);
    }

    private void listar(List<Evento>  eventos){
        eventos.forEach(System.out::println);
    }
}
