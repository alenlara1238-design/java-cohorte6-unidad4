public class Restaurante {
    private String nombre;
    private double distancia;
    private double calificacion;
    private int costoPromedio;


    public Restaurante(
        String nombre,
        double distancia,
        double calificacion,
        int costoPromedio
    ){
        this.nombre = nombre;
        this.distancia = distancia;
        this.calificacion = calificacion;
        this.costoPromedio = costoPromedio;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getDistancia() {
        return distancia;
    }


    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    public double getCalificacion() {
        return calificacion;
    }


    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    public int getCostoPromedio() {
        return costoPromedio;
    }


    public void setCostoPromedio(int costoPromedio) {
        this.costoPromedio = costoPromedio;
    }


    @Override
    public String toString(){
        return nombre +
                    " |Distancia: " + distancia +
                    "km | Rating: " + calificacion + 
                    " | Precio: $" + costoPromedio;
    }





    

}
