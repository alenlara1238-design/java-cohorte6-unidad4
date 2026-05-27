import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {




        List<Double> lista = List.of(100.0, 200.0, 50.0, 340.0);
      

       List<Double> conDescuento = PasandoLogica.procesarPrecios(lista, precio -> precio * 0.90);
        System.out.println("Precios con descuento: " + conDescuento);
        /*
        List<Integer> lista = List.of(2,3,4,5,6, 23, 343, 56);

        System.out.println("Numeros pares");
        ReutilizacionEjemplo.evaluarYMostrar(lista, n-> n % 2 == 0);
        
        System.out.println("numeros mayores a 10");
        ReutilizacionEjemplo.evaluarYMostrar(lista, n-> n > 10);
        
        System.out.println("Numeros impares");
        ReutilizacionEjemplo.evaluarYMostrar(lista, n-> n % 2 != 0);
       
       */ 



        ReutilizacionEjemplo ejemplo = new ReutilizacionEjemplo();
        ejemplo.miMetodo2();
    
    
    }

    public static void metodo1(List<Integer> numeros){
        for(Integer n: numeros){
            if(n%2 == 0){
                System.out.println(n);
            }
        }
    }

    public static void metodo2(List<Integer> numeros){
        for(Integer n: numeros){
            if(n > 10){
                System.out.println(n);
            }
        }
    }

     public static void metodo3(List<Integer> numeros){
        for(Integer n: numeros){
            if(n % 2 != 0){
                System.out.println(n);
            }
        }
    }

   
    
}

