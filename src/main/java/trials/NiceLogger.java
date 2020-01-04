package trials;


import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Antony Genil Gregory on 5/5/2019 5:54 AM
 * For project : JavaProfessionalCert
 **/
public class NiceLogger {
    static Logger logger = LogManager.getLogManager().getLogger("NiceLogger");

    public static void main(String[] args) {

        logger.log(Level.FINE,"Problem : "+generateDigag());

        // best approach
        /**
         * it is about reducing the number of objects in the JVM and mainly reducing computation. Lambdas doesn’t
         * compute the message, so if you don’t use that level you will not compute that message every time you use that code.
         */

        logger.log(Level.FINE, ()->  "Problem : "+ generateDigag());

    }

    static String generateDigag() {
        return "a lot of messages go from here...";
    }


}
