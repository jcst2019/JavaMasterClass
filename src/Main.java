import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Persona (String nombre, String apellido){

        @Override
        public String toString() {
            return "Person{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        //List<Persona> listaPersonas =  new ArrayList<>();
        List<Persona> listaPersonas =  new ArrayList<>(Arrays.asList(
                new Main.Persona("Juan","Solar Torres"),
                new Persona("Paola","Avila"),
                new Persona("Anibal","Torres"),
                new Persona("Alavaro","Solar")
        ));
        //Usando una clase Anónima
        var comparatorLastName = new Comparator<Persona>(){

            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.apellido().compareTo(o2.apellido());
            }
        };

        //listaPersonas.sort(comparatorLastName);
//        listaPersonas.sort( new Comparator<Persona>(){
//
//            @Override
//            public int compare(Persona o1, Persona o2) {
//                return o1.apellido().compareTo(o2.apellido());
//            }
//        });

        listaPersonas.sort((o1, o2) -> o1.apellido().compareTo(o2.apellido()));

        System.out.println(listaPersonas);


    }
}
