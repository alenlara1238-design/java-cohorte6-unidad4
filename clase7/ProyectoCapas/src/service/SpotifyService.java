package service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Cancion;
import repository.CancionRepository;

public class SpotifyService {
    private final CancionRepository repository;

    public SpotifyService(CancionRepository repository) {
        this.repository = repository;
    }

    public List<Cancion> obtenerCancionesCortas(int duracionMaxima) {
       return repository.obtenerCanciones().stream()
                .filter(c -> c.getDuracionSegundos() <= duracionMaxima)
                .toList();
    }

    // Este método obtiene un catálogo agrupado por Artista
    public Map<String, List<Cancion>> obtenerCatalogoPorArtistas(){
        return repository.obtenerCanciones().stream()
                        .collect(Collectors.groupingBy(Cancion::getArtista));
    }




}
