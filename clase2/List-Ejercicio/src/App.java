import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<String> pacientes = new LinkedList<>();
        pacientes.add("Paciente 1: dolor de cabeza intenso");
        pacientes.add("Paciente 2: Revisión de puntos");
        pacientes.add("Paciente 3: dolor intenso de estomago");
        pacientes.add("Paciente 4: Esguince de tobillo");
        pacientes.add("Paciente 5: gastroenteritis");


       String pacienteCritico = "PACIENTE CRITICO: herido de bala";

       //pacientes.addFirst(pacienteCritico);
       

    }

    public static void ejemploArrayList(){
         List<String> canciones = new ArrayList<>();

        canciones.add("1. Bohemian Rapsody- Queen");
        canciones.add("2. La vaca Lola - unknown");
        canciones.add("3. Imagine -  John Lennon");
        canciones.add("4. El otro lado del silencio - Angeles del infierno");
        canciones.add("5. In the End -  Linkin park");
        canciones.add("6. The reason - Hoobastank");

        int seleccionUsuario = 3;

         if(seleccionUsuario >= 1 && seleccionUsuario <= canciones.size()){
            String cancion = canciones.get(seleccionUsuario - 1);
            System.out.println("Reproduciendo: " + cancion);
         }
         else{
            System.out.println("La lista no contiene esa canción");
         }
    }
}
