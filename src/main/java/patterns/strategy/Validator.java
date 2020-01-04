package patterns.strategy;

/**
 *
 * Strategy pattern is a common solution for representing a family of algorithms and letting you choose among them at
 * runtime.
 * Created by Antony Genil Gregory on 5/5/2019 9:17 AM
 * For project : JavaProfessionalCert
 **/
public class Validator {

    private final ValidationStrategy validationStrategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String string) {
        return validationStrategy.execute(string);
    }

    public static void main(String[] args) {
        //Experiment the power of strategy with Java 8
        Validator numericValidator = new Validator((String s)->s.matches("[0-9]+"));
        boolean b1 = numericValidator.validate("123465");
        System.out.println("Is numeric ? "+b1);

        Validator lowerCaseValidator = new Validator((String s)-> s.matches("[a-z]+"));
        System.out.println("is all in lowerCase "+ lowerCaseValidator.validate("abcdef"));


    }
}
