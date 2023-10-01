package streams.practica;

import java.util.Comparator;
import java.util.stream.Stream;

public class practicaStream {

    public static void main(String[] args) {

        Stream<Videogame> myStram = Database.videogames.stream();
        System.out.println(myStram); //Me imprime el objeto
        myStram.forEach(System.out::println);
        System.out.println("Ordenar el Stream");
        Stream<Videogame> myStream2 = Database.videogames.stream();
        //Muesyra este error stream has already been operated upon or closed
        //myStram2.filter(v -> v.getConsole().equals(Console.XBOX));
        //myStram2.forEach(s-> System.out.println(s));
        myStream2.filter(v -> v.getConsole().equals(Console.XBOX))
                 .sorted(Comparator.comparing(Videogame::getName))
                 .forEach(System.out::println);

    }
}
