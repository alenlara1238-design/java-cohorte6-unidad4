import java.util.Objects;

public class Persona {
    
    private String cedula;
    private String nombre;


    public Persona(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    @Override
    public int hashCode(){
        return Objects.hash(cedula);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Persona persona = (Persona)o;
        return Objects.equals(this.cedula, persona.cedula);
    }
}
