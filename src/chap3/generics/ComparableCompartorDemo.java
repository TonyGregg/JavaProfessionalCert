package chap3.generics;

import java.util.Comparator;

/**
 * Created by Antony Genil Gregory on 10/24/2019 3:57 PM
 * For project : JavaProfessionalCert
 **/
public class ComparableCompartorDemo implements Comparator<Squirrel> {
    public static void main(String[] args) {

    }

    @Override
    public int compare(Squirrel o1, Squirrel o2) {
        Comparator<Squirrel> comparator = Comparator.comparing(s-> s.getName());
        comparator.thenComparingInt(s->s.getAge());

        return comparator.compare(o1, o2);

    }
}

class ComparableCompartorDemo1 implements Comparable<Squirrel> {
    public static void main(String[] args) {

    }


    @Override
    public int compareTo(Squirrel o) {
        return 0;
    }
}
class Squirrel {
    private String name;
    private int age;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
