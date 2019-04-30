package trials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by genil on 2019-04-28 at 12 56
 **/
public class CamparableComparator {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
//        Collections.sort(footballTeam);

        /**
         * If Plalyer is NOT implementing Comparable, the natural way the above Collections.sort won't compile
         *
         * Another way is to use Comparator Interface and java 8 makes it easy
         */

        Collections.sort(footballTeam, Comparator.comparing(Player::getAge));


        System.out.println("After Sorting : " + footballTeam);


    }
}
