package streams;

/**
 * Created by Antony Genil on 2019-05-31 at 08 24 for JavaProfessionalCert
 **/
public class Trader {
    private final String name;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    private final String city;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
