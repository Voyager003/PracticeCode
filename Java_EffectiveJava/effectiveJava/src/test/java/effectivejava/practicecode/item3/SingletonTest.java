package effectivejava.practicecode.item3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    @DisplayName("싱글톤 인스턴스는 단 하나의 인스턴스만 생성한다.")
    public void Test1() throws Exception {

        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        assertSame(singleton1, singleton2);
    }

    @Test
    @DisplayName("직렬화/역직렬화를 거친 인스턴스는 초기 인스턴스와 같지않다.")
    public void Test2() throws Exception {

        Singleton2 instance1 = Singleton2.getInstance();

        // 직렬화
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance1);
        oos.close();

        // 역직렬화
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Singleton2 instance2 = (Singleton2) ois.readObject();
        ois.close();

        assertNotSame(instance1, instance2);
    }

    @Test
    @DisplayName("readResolve를 정의한 싱글톤 클래스 객체")
    public void Test3() throws Exception {

        Singleton3 instance1 = Singleton3.getInstance();

        // 직렬화
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance1);
        oos.close();

        // 역직렬화
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Singleton3 instance2 = (Singleton3) ois.readObject();
        ois.close();

        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("ENUM 타입 직렬화, 역직렬화 테스트")
    public void Test4() throws Exception {

        SingletonEnum instance1 = SingletonEnum.INSTANCE;

        // 직렬화
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance1);
        oos.close();

        // 역직렬화
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SingletonEnum instance2 = (SingletonEnum) ois.readObject();
        ois.close();

        assertSame(instance1, instance2);
    }
}
