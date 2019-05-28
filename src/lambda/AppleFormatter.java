package lambda;

import org.genil.learning.java8.collections.Apple;

/**
 * Created by anton on 6/7/2018 2:09 PM
 **/
@FunctionalInterface
public interface AppleFormatter {
    public String printStylishly(Apple apple);
}


class AppleHeavyLightPrinter implements AppleFormatter {

    @Override
    public String printStylishly(Apple apple) {
        return "(H) Hearrty healthy apple. Your color is "+apple.getColor();
    }
}

class AppleDottedPrinter implements AppleFormatter{

    @Override
    public String printStylishly(Apple apple) {
        return "Weight watcher apple "+apple.getWeight() +" .... color is "+apple.getColor();
    }
}
