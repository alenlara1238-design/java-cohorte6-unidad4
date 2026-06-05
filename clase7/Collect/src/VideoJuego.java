public class VideoJuego {
    private String nombre;
    private double precio;
    private String genero;

    public VideoJuego(String nombre, double precio, String genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getGenero(){
        return genero;
    }

    @Override
    public String toString(){
        return nombre + " (" + genero + ") - $" + precio;
    }
    
}
