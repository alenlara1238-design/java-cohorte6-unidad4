import java.util.HashSet;
import java.util.Set;

public class ObjectHashSet {
    public static void main(String[] args) {
        Set<Persona> registroCivil = new HashSet<>();

        registroCivil.add(new Persona("232132", "Gabriel Guzman"));
        registroCivil.add(new Persona("11111", "Ana Bermudez"));


        boolean seAgrego = registroCivil.add(new Persona("232132", "Gabriela Guzmana"));

        System.out.println("¿Se pudo agregar?: " + seAgrego);

        System.out.println("Total personas: " + registroCivil.size());

        

    }
}
