package model;
public class Cancion {
    private String id;
    private String titulo;
    private String artista;
    private String genero;
    private int duracionSegundos;
    
    public Cancion(String id, String titulo, String artista, String genero, int duracionSegundos) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracionSegundos = duracionSegundos;
    }

    public String getId() {
        return id;
    }   
    public String getTitulo() {
        return titulo;
    }
    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }
    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Título: %s, Artista: %s, Género: %s, Duración: %d segundos",
                id, titulo, artista, genero, duracionSegundos);
    }

}
