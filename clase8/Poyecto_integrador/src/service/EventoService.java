package service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Evento;
import repository.EventoRepository;

public class EventoService {
    private EventoRepository repo;

    public EventoService(EventoRepository repository){
        this.repo = repository;
    }

    public List<Evento> listarEventos(){
       return this.repo.obtenerTodos();
    }


    public List<Evento> eventosGratuitos(){
        return this.repo.obtenerTodos().stream()
                    .filter(e -> e.getPrecioEntrada() == 0)
                    .toList();
    }

    public List<Evento> cuposDisponibles(){
        return repo.obtenerTodos().stream()
                    .filter(e -> e.getCuposDisponibles() > 0)
                    .toList();
    }

    public List<Evento> eventosPorCategoria(String categoria){
        return repo.obtenerTodos().stream()
                .filter(e -> e.getCategoria().equals(categoria))
                .toList();
    }

    public List<Evento> eventosPorCiudad(String ciudad){
        return repo.obtenerTodos().stream()
                    .filter(e -> e.getCiudad().equals(ciudad))
                    .toList();
    }

    public Set<String> obtenerCategorias(){
        return repo.obtenerTodos().stream()
                .map(e -> e.getCategoria())
                .collect(Collectors.toSet());
    }

    public Map<String, Double> mapaNombrePrecio(){
        return this.repo.obtenerTodos().stream()
                .collect(Collectors.toMap(Evento::getNombre, Evento::getPrecioEntrada));
    }


    public Map<String, List<String>> agruparPorCategoria(){
        return this.repo.obtenerTodos().stream()
                    .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.mapping(Evento::getNombre, Collectors.toList())));
    }

    
}
