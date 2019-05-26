package patterns.strategy;

/**
 * Created by Antony Genil Gregory on 5/5/2019 9:18 AM
 * For project : JavaProfessionalCert
 **/
@FunctionalInterface
public interface ValidationStrategy {

    public boolean execute(String word);
}
