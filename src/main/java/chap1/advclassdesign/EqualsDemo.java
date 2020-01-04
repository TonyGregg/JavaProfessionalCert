package chap1.advclassdesign;

/**
 * Created by genil on 1/12/19 at 21 32
 **/
public class EqualsDemo {
    public static void main(String[] args) {
        Lion kingLion = new Lion();
        kingLion.setId(200);

        Lion queenLion = new Lion();
        queenLion.setId(350);

        if(kingLion.equals(queenLion)) {
            System.out.println("Both the lions of equal power");
        } else {
            System.out.println("Nope, the lions of different power");
        }
    }
}
