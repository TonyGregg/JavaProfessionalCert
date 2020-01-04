package patterns.factory;

/**
 * Created by genil on 6/24/18 at 06 35
 *
 * Fatory pattern creates object without exposing logic to the client.
 *
 * Factory deals with the problem of creating object.
 *
 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to
 * return one of the sub-class.
 *
 * This pattern take out the responsibility of instantiation of a class from client program to the factory class.
 *
 * It is one of the widely used patterns in Java
 *
 **/
public class FactoryDemo {

    public static void main(String[] args) {
        Shape round = ShapeFactory.getShape("round");
        Shape square = ShapeFactory.getShape("square");

        round.draw();
        square.draw();

        round.log();
        round.oneMore();

        Shape.log3();
    }


}
