package patterns.builder;

/**
 * Created by genil on 2019-05-16 at 20 46
 **/
public class User {
    private String email;
    private String sex;
    private int age;
    private String visaStatus;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", visaStatus='" + visaStatus + '\'' +
                '}';
    }

    private User(Builder builder) {
        this.email = builder.email;
        this.sex = builder.sex;
        this.age = builder.age;
        this.visaStatus = builder.visaStatus;
    }

    public static class Builder {
        private final String email;
        private final String sex;
        private int age; // optional fields
        private String visaStatus;

        public Builder(String email, String sex) {
            this.email = email;
            this.sex = sex;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder visaStatus(String visaStatus) {
            this.visaStatus = visaStatus;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    public static void main(String[] args) {

    }




}
