package model;

public class Evento {
    private int codigo;
    private String nombre;
    private String categoria;
    private String ciudad;
    private double precioEntrada;
    private int cuposDisponibles;

    public Evento(int codigo, String nombre, String categoria, String ciudad, double precioEntrada,
            int cuposDisponibles) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.ciudad = ciudad;
        this.precioEntrada = precioEntrada;
        this.cuposDisponibles = cuposDisponibles;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    @Override
    public String toString(){
        return """
                ---------------------
                Código: %d
                Evento: %s
                Categoria: %s
                Ciudad: %s
                Precio: %.2f
                Cupos: %d
                """.formatted(
                    this.codigo,
                    this.nombre,
                    this.categoria,
                    this.ciudad,
                    this.precioEntrada,
                    this.cuposDisponibles
                );
    }

    
}
