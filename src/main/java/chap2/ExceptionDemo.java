package chap2;

/**
 * Created by Antony Genil on 2019-08-18 at 21 00 for JavaProfessionalCert
 **/
public class ExceptionDemo {
    private static int demo(int x) {
        try {
//            return 1;
            if (x == 1) {
                return 1;

            }
            throw new Exception("dfs");
        }catch (Exception ex) {
            return 2;
        }
//        finally {
//            return 4;
//        }
    }

    public static void main(String[] args) {
        int out = demo(12);
        System.out.println("out "+out);
    }
}
