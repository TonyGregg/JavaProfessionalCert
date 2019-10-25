package chap1.advclassdesign;

/**
 * Created by Antony Genil on 2019-10-01 at 16 47 for JavaProfessionalCert
 **/
public class AnonInner {
    interface SaleOnly {
        public int dollarsOff();
    }
    public int pay() {
        return admission( 5, new SaleOnly(){
            public int dollarsOff() {
                return 23;
            }
        });
    }

    public int admission( int basePrice, SaleOnly saleOnly) {
        return basePrice - saleOnly.dollarsOff();
    }

    public static void main(String[] args) {
        AnonInner demo = new AnonInner();
        System.out.println(demo.pay());
    }
}
