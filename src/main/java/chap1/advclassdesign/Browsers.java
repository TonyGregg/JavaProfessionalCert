package chap1.advclassdesign;

/**
 * Created by genil on 2/11/19 at 08 20
 **/
public class Browsers {
    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }

    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }

    static class IE extends Browser {
        @Override
        public void go() {
            System.out.println("Inside IE");
        }
    }

    public static void main(String[] args) {
        Browser b = new Browser();
        IE e = (IE) b;
        e.go();
    }
}