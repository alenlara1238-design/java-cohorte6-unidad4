import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       int elementos = 100_000;

       List<Integer> arrayList = new ArrayList<>();
       List<Integer> linkedList = new LinkedList<>();

        //lenaos ambas listas
       for(int i = 0; i < elementos; i++){
        arrayList.add(i);
        linkedList.add(i);
       }


       System.out.println("---Prueba 1: Acceso por indice get()---");
       long inicio = System.nanoTime();
       arrayList.get(elementos /2);
       long fin = System.nanoTime();
       System.out.println("ArrayList tardó: " + (fin - inicio) + " ns");


       inicio = System.nanoTime();
       linkedList.get(elementos /2);
       fin = System.nanoTime();
        System.out.println("LinkedList tardó: " + (fin - inicio) + " ns");


       System.out.println("---Prueba 2: Insertar al inicio add(0)---");
       inicio = System.nanoTime();
       arrayList.add(0, -1);
       fin = System.nanoTime();
       System.out.println("ArrayList tardó: " + (fin - inicio) + " ns");


       inicio = System.nanoTime();
       linkedList.add(0, -1);
       fin = System.nanoTime();
        System.out.println("linkedList tardó: " + (fin - inicio) + " ns");




    }
}
