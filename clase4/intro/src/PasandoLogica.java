import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PasandoLogica {
    public static List<Double> procesarPrecios(List<Double> precios, Function<Double, Double> operacion){
           
        List<Double> resultados = new ArrayList<>();
        Double precioModificado ;
        
            for(Double precio: precios){
                precioModificado = operacion.apply(precio);
                resultados.add(precioModificado);
            }
        return resultados;
    }


    public boolean esPar(Integer n){
        return n % 2 == 0;
    }
    
    /*
        (Integer n) {return n % 2 == 0;}


        (n) return n % 2 == 0;

         n -> n % 2 == 0; Expresión Lambda



        n -> n > 10

        public boolean nombre(Integer n){
         return n > 10;
         }


         precio -> precio * 0.90)

         public Double nombre(Double precio){
            return precio * 0.90;
         }

    */

}
