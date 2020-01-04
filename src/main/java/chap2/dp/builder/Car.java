package chap2.dp.builder;

/**
 * Created by genil on 2/19/19 at 17 58
 **/
public class Car {

    String color;
    int hp;
    String seatColor;


    public static class Builder {
        // Required parameters
        String make;
        int year;

        //optional parameters
        String color = "White";
        int hp = 20;
        String seatColor = "Black";

        public Builder(String make, int year) {

            this.make = make;
            this.year = year;

        }

        public Builder color(String val) {
            this.color = val;
            return this;
        }

        public Builder hp(int val) {
            this.hp = val;
            return this;
        }

        public Builder seatColor(String val) {
            this.seatColor = val;
            return this;
        }

        public Car build() {

            return new Car(this);

        }
    }

    private Car(Builder carBuilder) {
        hp = carBuilder.hp;
        seatColor = carBuilder.seatColor;
        color = carBuilder.color;
    }
}


class CarBuildDemo {
    public static void main(String[] args) {

        Car car = new Car.Builder("Honda",2019).color("Black").hp(25000).build();

        System.out.println(car.color);

    }
}

