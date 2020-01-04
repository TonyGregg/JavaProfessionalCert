package lambda.applestory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Created by Antony Genil Gregory on 1/1/2020 10:03 PM
 * For project : JavaProfessionalCert
 **/
public class AppleDemo {

    public static void main(String[] args) {
        List<Apple> apples = generateApples();
        playWithApplesOldWay(apples);

    }

    private static List<Apple> generateApples() {
        List<Apple> apples = List.of(
                new Apple(10, AppleColor.GREEN, AppleType.FUJI),
                new Apple(20, AppleColor.RED, AppleType.RED_DELICIOUS),
                new Apple(25, AppleColor.RED, AppleType.DAISY),
                new Apple(32, AppleColor.RED, AppleType.GRANNY_SMITH),
                new Apple(14, AppleColor.RED, AppleType.GOLDEN_DELICIOUS),
                new Apple(26, AppleColor.RED, AppleType.GALA),
                new Apple(22, AppleColor.RED, AppleType.HONEY_CRISP),
                new Apple(30, AppleColor.YELLOW, AppleType.COSMIC_CRISP)
        );
        return apples;
    }

    private static void playWithApplesOldWay(List<Apple> apples) {
        // Sort apples by weight
        Comparator<Apple> appleComparator = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

        Collections.sort(apples, appleComparator);
        apples.forEach(System.out::print);

    }
}

class Apple {
    Integer weight;
    AppleColor appleColor;
    AppleType appleType;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public AppleColor getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(AppleColor appleColor) {
        this.appleColor = appleColor;
    }

    public AppleType getAppleType() {
        return appleType;
    }

    public void setAppleType(AppleType appleType) {
        this.appleType = appleType;
    }

    Apple(int weight, AppleColor appleColor, AppleType appleType) {
        this.weight = weight;
        this.appleColor = appleColor;
        this.appleType = appleType;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", appleColor=" + appleColor +
                ", appleType=" + appleType +
                '}';
    }
}

enum AppleColor {
    GREEN, RED, YELLOW
}

enum AppleType {
    HONEY_CRISP, COSMIC_CRISP, DAISY, FUJI, GOLDEN_DELICIOUS, GALA, GRANNY_SMITH, RED_DELICIOUS
}
