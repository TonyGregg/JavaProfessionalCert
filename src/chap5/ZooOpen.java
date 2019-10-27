package chap5;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Antony Genil Gregory on 10/27/2019 8:16 AM
 * For project : JavaProfessionalCert
 **/
public class ZooOpen {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale fr = new Locale("fr", "FR");
        printProps(us);
        printProps(fr);
    }
    private static void printProps(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(resourceBundle.getString("hello") + " -- " + resourceBundle.getString("open"));
    }

}
