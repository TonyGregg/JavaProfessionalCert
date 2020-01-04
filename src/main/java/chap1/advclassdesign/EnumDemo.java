package chap1.advclassdesign;

/**
 * Created by genil on 2/7/19 at 08 28
 **/
public class EnumDemo {
    enum Season {
        WINTER("LOW") {
            public void printHours() {
                System.out.println("Frozen hours");
            }
        }, SPRING("High") {
            public void printHours() {
                System.out.println("Blossom hours");
            }
        }, SUMMER("Super high") {
            public void printHours() {
                System.out.println("Sunny hours");

            }
        }, FALL {
            public void printHours() {
                System.out.println("Bit cold hours");

            }
        };
        public abstract void printHours();


        private Season(String expectedVisitors) {
            this.expectedVisitors  = expectedVisitors;
        }
        private Season() {

        }
        String getExpectedVisitors() {
            return this.expectedVisitors;
        }

        private String expectedVisitors;
    }

    public static void main(String[] args) {
        Season s = Season.WINTER;
        System.out.println(Season.SUMMER);

        System.out.println( s == Season.WINTER);

        for ( Season seas: Season.values()) {
            System.out.println(seas.name() + " "+seas.ordinal());
        }

        String expVis = Season.WINTER.getExpectedVisitors();

        System.out.println(expVis);
        expVis = s.getExpectedVisitors();

        System.out.println(expVis);

        Season.SPRING.printHours();

        Season season = Season.SPRING;
        System.out.println(Season.WINTER.ordinal());
        season.printHours();

        switch (season) {
            case WINTER:
                System.out.println("Sema kulir");
                break;
            case FALL:
                System.out.println("Varapoghuthu.. enjoy pannu konja nall " + season.getExpectedVisitors());
                break;
            case SPRING:
                System.out.println("Enna oru vasantha kalam !! aha. ." + season.getExpectedVisitors());
                break;
        }


    }
}


