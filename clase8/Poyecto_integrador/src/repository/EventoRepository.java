package repository;

import java.util.List;

import model.Evento;

public class EventoRepository {
    private final List<Evento> eventos = List.of(
        new Evento(1, "java conf", "Tecnología", "Bogotá", 0, 120),
        new Evento(2, "Python tech", "Tecnología", "Medellin", 120000, 80),
        new Evento(3, "Comic Con", "Convención", "Cali", 90000, 0),
        new Evento(4, "Feria del libro", "Cultural", "Manizales", 60000, 200),
        new Evento(5, "Maratón 4k", "Deportivo", "Barranquilla", 1000, 300),
        new Evento(6, "Hackaton Medellin", "Tecnología", "Medellín", 150000, 56),
        new Evento(7, "Feria de las dos ruedas", "Convención", "Bucaramanga", 70000, 250),
        new Evento(8,"Festival del acordeón", "Cultural", "Valledupar", 350000, 150),
        new Evento(9, "Feria Ganadera", "Cultural", "Montería", 0, 250),
        new Evento(10, "Festival del Jazz", "Cultural", "Mompox", 25000, 100)
    );

    public List<Evento> obtenerTodos(){
        return eventos;
    }
}
