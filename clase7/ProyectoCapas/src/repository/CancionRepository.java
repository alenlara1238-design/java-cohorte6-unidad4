package repository;

import java.util.List;

import model.Cancion;

public class CancionRepository {

    // simulamos una base de datos con una list de canciones
    /*
     * private String id;
     * private String titulo;
     * private String artista;
     * private String genero;
     * private int duracionSegundos;
     */
    public List<Cancion> obtenerCanciones() {
        return List.of(
                new Cancion("C1", "Bohemian Rhapsody", "Queen", "Rock", 354),
                new Cancion("C2", "Shape of You", "Ed Sheeran", "Pop", 263),
                new Cancion("C3", "Blinding Lights", "The Weeknd", "Synthwave", 200),
                new Cancion("C4", "Smells Like Teen Spirit", "Nirvana", "Grunge", 301),
                new Cancion("C5", "Billie Jean", "Michael Jackson", "Pop", 294),
                new Cancion("C6", "Hotel California", "Eagles", "Rock", 390),
                new Cancion("C7", "Rolling in the Deep", "Adele", "Soul", 228),
                new Cancion("C8", "Stairway to Heaven", "Led Zeppelin", "Rock", 482),
                new Cancion("C9", "Uptown Funk", "Mark Ronson ft. Bruno Mars", "Funk", 270),
                new Cancion("C10", "Hey Jude", "The Beatles", "Rock", 431),
                new Cancion("C11", "Despacito", "Luis Fonsi ft. Daddy Yankee", "Reggaeton", 229),
                new Cancion("C12", "Imagine", "John Lennon", "Soft Rock", 183)
        );

    }
}
