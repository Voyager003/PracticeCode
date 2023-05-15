package effectivejava.practicecode.item1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StaticFactoryMethod {

    @Test
    @DisplayName("기존 생성자 방식")
    public void test1() throws Exception {

        User user = new User("Rim", "abc@gmail.com", "Seoul");

        String name = user.getName();
        String city = user.getCity();
        String email = user.getEmail();

        assertThat(name).isEqualTo("Rim");
        assertThat(email).isEqualTo("abc@gmail.com");
        assertThat(city).isEqualTo("Seoul");
    }

    @Test
    @DisplayName("정적 팩토리 메서드 방식")
    public void test2() throws Exception {

        User user = User.createWithDefaultCity("Kim", "abcd@gmail.com");

        assertThat(user.getName()).isEqualTo("Kim");
        assertThat(user.getEmail()).isEqualTo("abcd@gmail.com");
        assertThat(user.getCity()).isEqualTo("Rome");
    }

    @Test
    @DisplayName("하위 자료형 객체를 반환")
    public void test3() throws Exception {

        int score = 90;
        Level level = Level.checkLevel(score);

        assertThat(level).isNotInstanceOf(Basic.class);
        assertThat(level).isNotInstanceOf(Advanced.class);
        assertThat(level).isInstanceOf(Master.class);

        assertThat(level).isInstanceOf(Level.class);
    }

    @Test
    @DisplayName("Lombok을 이용한 정적 팩토리 메서드 구현")
    public void test4() throws Exception {

        LombokUser user = LombokUser.of("Park", "ab@gmail.com", "Rome");

        assertThat(user.getName()).isEqualTo("Park");
        assertThat(user.getEmail()).isEqualTo("ab@gmail.com");
        assertThat(user.getCity()).isEqualTo("Rome");
    }
}
