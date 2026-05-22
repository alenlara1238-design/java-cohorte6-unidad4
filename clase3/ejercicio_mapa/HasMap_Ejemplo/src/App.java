import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MapPruducto();
    }

    public static void MapPruducto(){
         Scanner sc = new Scanner(System.in);

        Map<Long, Producto> inventario = new HashMap<>();

        inventario.put(1234L, new Producto(1234L, "Laptop"));
        inventario.put(4567L, new Producto(4567L, "Monitor"));
        inventario.put(8900L, new Producto(8900L, "Teclado"));

         System.out.println("========== INVENTARIO INICIAL ==========");

         for(Map.Entry<Long, Producto> producto : inventario.entrySet()){
            System.out.println("Id: " + producto.getKey() + " Nombre: " + producto.getValue().getNombre());
         }

         System.out.println("========== INVENTARIO INICIAL sobre valores==========");
         for(Producto producto : inventario.values()){
            System.out.println("Id: " + producto.getId() + " nombre: " + producto.getNombre());
         }
    }

    public static void Mapinicial(){
         Scanner sc = new Scanner(System.in);

        Map<String, Integer> inventario = new HashMap<>(); // Map<String, Producto> inventario = new HashMap<>();

        //agregar producto
        inventario.put("Laptop", 15); // inventario.put("Laptop", new Producto(11213, "Laptop", 40))
        inventario.put("Teclado", 10);
        inventario.put("Monitor", 20);
        inventario.put("Monitor", 9);
     

        System.out.println("========== INVENTARIO INICIAL ==========");
        for(Map.Entry<String, Integer> producto : inventario.entrySet()){
           System.out.println( "Producto: " + producto.getKey() + "| Cantidad: " + producto.getValue());
        }

        System.out.println("\nIngrese el nombre del producto a buscar: ");
        String nombre = sc.nextLine();


        if(inventario.containsKey(nombre)){
             Integer cantidad = inventario.get(nombre);
             System.out.println("Producto encontrado.");
             System.out.println("Cantidad disponible: " + cantidad);
        }else{
            System.out.println("El producto no fue encontrado");
        }

        
        //actualizamos la cantidad (valor) de teclado
        System.out.println("\nActualizando la cantidad de teclado");
        inventario.put("Teclado", 20);
        System.out.println("Nueva cantidad de Teclado: " + inventario.get("Teclado"));

        System.out.println("\nEliminando el monitor");
        inventario.remove("Monitor");

        System.out.println("\n=====INVENTARIO ACTUALIZADO=====");
        for(Map.Entry<String, Integer> producto : inventario.entrySet()){
            System.out.println("""
                            Producto: %s |  Cantidad: %d""".formatted(producto.getKey(), producto.getValue()));
        }
       

        // Me interesa solo mostrar los nombres de los productos
        System.out.println("\n=========== Lista de productos========");
        for(String clave : inventario.keySet()){
            System.out.println(clave);
        }

        // Me interesa solo mostrar la cantidad de los productos
        System.out.println("\n===============Cantidades disponibles=============");
        for(Integer cantidad : inventario.values()){
            System.out.println(cantidad);
        }

        System.out.println("\nCantidad total de productos:" + inventario.size());
        sc.close();
    }
}
