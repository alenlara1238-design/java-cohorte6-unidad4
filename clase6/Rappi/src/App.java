import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Restaurante> restaurantes  = List.of(
            new Restaurante("Burger House", 1.3, 4.8, 25000),
            new Restaurante("Pizza Express Java", 3.5, 4.6, 18000),
            new Restaurante("Tacos Mx", 0.8, 4.4, 15000),
            new Restaurante("Miyagi Sushi", 5.1, 4.9, 45000),
            new Restaurante("Pollo Contento", 2.0, 4.9, 65000),
            new Restaurante("KFC", 3.4, 4.7, 27000)
        );

        //Mostrar restaurantes a menos de 3.0 km
        System.out.println("Restaurante a menos de 3.0 km");
        restaurantes.stream()
                    .filter(r -> r.getDistancia() < 3)
                    .forEach(System.out::println);

    
        //Los más cercanos primero
        System.out.println("\nLos más cercanos primero");
        restaurantes.stream()
                    .sorted(
                        Comparator.comparing(Restaurante::getDistancia)
                    )
                    .forEach(System.out::println);
        

        // Mejor calificados primero
        System.out.println("\nMejor calificados primero");
        restaurantes.stream()
                    .sorted(
                        Comparator.comparing(Restaurante::getCalificacion).reversed()
                    )
                    .forEach(System.out::println);

        //Más baratos primero
        System.out.println("\nMás baratos primero");
        restaurantes.stream()
                    .sorted(
                        Comparator.comparing(Restaurante::getCostoPromedio)
                    )
                    .forEach(System.out::println);
    

        //El restaurante mejor calificado
                Restaurante mejor =  restaurantes.stream()
                            .max(
                                Comparator.comparing(Restaurante::getCalificacion)
                            ).orElse(new Restaurante("Ninguno", 0, 0, 0));

                        System.out.println(mejor);
                            //ifPresent(mejorrestaurate -> {
                                //   imprimir (tomar acción sobre el resultado)
                            //     })


                /**
                 * Mostrar restaurantes que:
                 * estén a menos de 4 km
                 * tengan rating mínimo de 4.5
                 * ordenar por rating (calificacion) descendente
                 * en empate, por distancia ascendente
                 */
                String criterios = """
                Mostrar restaurantes que:
                 * estén a menos de 4 km
                 * tengan rating mínimo de 4.5
                 * ordenar por rating (calificacion) descendente
                 * en empate, por distancia ascendente
                        """;
                System.out.println(criterios);
                restaurantes.stream()
                            .filter(r -> r.getDistancia() < 4.0 && r.getCalificacion() >= 4.5)
                            .sorted(
                                Comparator.comparing(Restaurante::getCalificacion).reversed()
                                            .thenComparing(Restaurante::getDistancia)
                            ).forEach(System.out::println);
                

    }
}
