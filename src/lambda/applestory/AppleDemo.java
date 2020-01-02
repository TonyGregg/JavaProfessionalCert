package lambda.applestory;

import java.util.List;

/**
 * Created by Antony Genil Gregory on 1/1/2020 10:03 PM
 * For project : JavaProfessionalCert
 **/
public class AppleDemo {
}

class Apple {
    int weight;
    AppleColor appleColor;
    AppleType appleType;
    Apple(int weight, AppleColor appleColor, AppleType appleType) {
        this.weight = weight;
        this.appleColor = appleColor;
        this.appleType = appleType;
    }

    public static void main(String[] args) {

    }

    private static void playWithApplesOldWay() {
        List<Apple> apples = List.of(
                new Apple(10, AppleColor.GREEN, AppleType.FUJI),
                new Apple(20, AppleColor.RED, AppleType.RED_DELICIOUS),
                new Apple(25, AppleColor.RED, AppleType.DAISY),
                new Apple(32, AppleColor.RED, AppleType.GRANNY_SMITH),
                new Apple(14, AppleColor.RED, AppleType.GOLDEN_DELICIOUS),
                new Apple(16, AppleColor.RED, AppleType.GALA),
                new Apple(16, AppleColor.RED, AppleType.HONEY_CRISP),
                new Apple(30, AppleColor.YELLOW, AppleType.COSMIC_CRISP)
        );
    }


}

enum AppleColor {
    GREEN, RED, YELLOW
}

enum AppleType {
    HONEY_CRISP, COSMIC_CRISP, DAISY, FUJI, GOLDEN_DELICIOUS, GALA, GRANNY_SMITH, RED_DELICIOUS
}
