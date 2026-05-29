import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
       ejemplo4();
    }

    public static void ejemplo1(){

        List<String> juegos = List.of(
            "Mortal Kombat",
            "Mario Bros",
            "Fortnite",
            "War",
            "Call of duty",
            "God of  War"
        );

        juegos.stream()
                .filter(juego -> juego.length() > 5)
                .filter(juego -> juego.startsWith("M"))
                .map(juego -> juego.toUpperCase())
                .forEach(juego -> System.out.println(juego));
    }


    public static void ejemplo2(){

        List<Cancion> canciones = List.of(
            new Cancion("Me vale", 95000, 4.8),
            new Cancion("Despacito", 87000, 3.8),
            new Cancion("Olvidarme de ella", 120000, 5.0),
            new Cancion("Oye mi amor", 450000, 4.1),
            new Cancion("Rosas", 78000, 4.5),
            new Cancion("Reminiscencia", 91000, 4.7)
        );

        canciones.stream()
                .filter(c -> c.reproducciones > 90000)
                .map(c -> c.nombre + " |" + c.calificacion)
                .forEach(resultado -> System.out.println(resultado));
    }

     public static void ejemplo3(){

        List<Cancion> canciones = List.of(
            new Cancion("Me vale", 95000, 4.8),
            new Cancion("Despacito", 87000, 3.8),
            new Cancion("Olvidarme de ella", 120000, 5.0),
            new Cancion("Oye mi amor", 450000, 4.1),
            new Cancion("Rosas", 78000, 4.5),
            new Cancion("Reminiscencia", 91000, 4.7)
        );

         canciones.stream()
                .filter(c -> c.reproducciones > 90000)
                .filter(c -> c.calificacion > 4.5)
                .sorted(
                    Comparator.comparingInt((Cancion c) -> c.reproducciones).reversed()
                )
                .limit(3)
                .map(c -> c.nombre + " | " + c.reproducciones)
                .forEach(s -> System.out.println(s));
     }

     public static void ejemplo4(){
        // Operaciones inteligentes
         List<Cancion> canciones = List.of(
            new Cancion("Me vale", 95000, 4.8),
            new Cancion("Despacito", 87000, 3.8),
            new Cancion("Olvidarme de ella", 120000, 5.0),
            new Cancion("Oye mi amor", 450000, 4.1),
            new Cancion("Rosas", 78000, 4.5),
            new Cancion("Reminiscencia", 91000, 4.7)
        );

       long total =  canciones.stream()
                .filter(c -> c.calificacion > 4.5)
                .count();
        System.out.println("Total canciones: " + total);


        boolean existe = canciones.stream()
                        .anyMatch(c -> c.nombre == "Rosas");
        
                     System.out.println("La cancion Rosa existe: " + existe);   

            Optional cancion = canciones.stream()
                .filter(c -> c.calificacion > 4.8)
                .findFirst();

                

     }
}
