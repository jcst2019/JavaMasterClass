package streams.practica;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Videogame {
    private String name;
    private Double price;
    private Console console;
    private List<Review> reviews;
    private String officialWebsite;
    private Boolean isDiscount;
    private Integer totalSold;

/*public static void main(String[] args) {
        var res = Database.videogames
                .stream()
                .collect(Collectors.groupingBy(videogame -> videogame.getConsole() == Console.XBOX,
                        Collectors.summarizingInt(Videogame::getTotalSold)));

        var res2 = Database.videogames
                .stream()
                .filter(v -> v.getIsDiscount())
                .map(v -> v.getReviews().size())
                .reduce(0, Integer::sum);

        var res3 = Database.videogames
                .stream()
                .collect(Collectors.groupingBy(v -> v.getConsole()));
        //System.out.println(res2);
        //System.out.println(res.get(true));
        System.out.println(res3.get(Console.ALL));
    }*/
}
