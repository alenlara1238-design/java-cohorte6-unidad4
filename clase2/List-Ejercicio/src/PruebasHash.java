import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PruebasHash {
    public static void main(String[] args) {
        // hashPrueba();
        //hashPrueba3();
        linkedHashSet();
    }

    public static void hashPrueba() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Perro");
        hashSet.add("Gato");
        hashSet.add("Caballo");
        hashSet.add("Perro"); // aqui no me da error

        System.out.println("HashSet: " + hashSet);

    }

    public static void hashPrueba2() {
        // registro de correos únicos
        Set<String> correos = new HashSet<>();

        correos.add("ana@gmail.com");
        correos.add("carlos@gmail.com");
        correos.add("juan@gmail.com");
        correos.add("juan@gmail.com");
        correos.add("juan@gmail.com");
        correos.add("juan@gmail.com");

        System.out.println(correos);
    }

    public static void hashPrueba3() {
        Set<String> bloqueados = new HashSet<>();

        bloqueados.add("Carlos");
        bloqueados.add("hacker123");

        bloqueados.add("Carlos");

        if (bloqueados.contains("Carlos")) {
            System.out.println("acceso denegado");
        }
    }

    public static void linkedHashSet() {
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Perro");
        hashSet.add("Gato");
        hashSet.add("Caballo");
        hashSet.add("Perro"); // aqui no me da error

        System.out.println("HashSet: " + hashSet);
    }

}
