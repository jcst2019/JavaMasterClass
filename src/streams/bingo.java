package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bingo {

    public static void main(String[] args) {

        List<String> bingoPool = new ArrayList<>(75);
        int start=1;
        for(char letra: "BINGO".toCharArray()){
//            System.out.println(letra);
            for (int i=start; i<(start+15);i++){
                bingoPool.add(""+letra+i);
                System.out.println(""+letra+i);
            }
            start += 15;

        }
        // Baragear los números
        Collections.shuffle(bingoPool);
        for (int i=0;i< 15; i++){
            System.out.println(bingoPool.get(i));
        }
        System.out.println("===========================================");

        List<String> firstOnes = bingoPool.subList(0,15);


    }
}
