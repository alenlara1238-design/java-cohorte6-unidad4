import java.util.List;
import java.util.function.Predicate;

public class ReutilizacionEjemplo {

    public static void evaluarYMostrar(List<Integer> numeros, Predicate<Integer> condicion){
        for(Integer n: numeros){
            if(condicion.test(n)){
                System.out.println(n);
            }
        }
    }

    public void miMetodo2(){
        System.out.println("Este metodo no es estático");
    }

}
