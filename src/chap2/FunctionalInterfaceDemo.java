package chap2.dp;

public class FunctionalInterfaceDemo {
}

@FunctionalInterface
interface Sprint {
    public void sprint(String animalName);
}

@FunctionalInterface
interface Run extends Sprint{
    public void sprint(String animal);
}

@FunctionalInterface
interface Skip extends Run{
    public static void skip(int speed) {
        speed = speed * 100;

    }
    public  default void printMyName(String name) {
        System.out.println("name is "+name);
    }
}