package chap3.generics;

/**
 * Created by genil on 2/27/19 at 08 02
 **/
public class GnericDemo {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Giraffee giraffee = new Giraffee();

        SizeLimitedCrate sizeLimitedCrate = new SizeLimitedCrate(elephant, 200);
        SizeLimitedCrate sizeLimitedCrate1 = new SizeLimitedCrate(giraffee, elephant);

    }
}

class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }

}

class Elephant {
    int weight;
    int name;
}

class Giraffee {
    int weight;
    int name;
}

interface Shippable<T> {
    public void ship(T t);
}

class ShippableCrate implements Shippable<Giraffee> {
    @Override
    public void ship(Giraffee giraffee) {
        
    }
}