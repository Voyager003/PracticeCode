package effectivejava.practicecode.item1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

    private String name;
    private String email;
    private String city;

    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.city = country;
    }

    public static User createWithDefaultCity(String name, String email) {
        return new User(name, email, "Rome");
    }
}
