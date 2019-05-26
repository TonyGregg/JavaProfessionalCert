package patterns.factory;

/**
 * Created by genil on 6/24/18 at 06 31
 **/
public class ShapeFactory {


    public static Shape getShape(String shapeType) {
        if("round".equals(shapeType)) {
            return new Round();
        }else if("square".equals(shapeType)) {
            return new Square();
        }
        return null;
    }

}
