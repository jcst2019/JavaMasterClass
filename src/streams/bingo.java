package streams;

import java.util.ArrayList;
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

    }
}
