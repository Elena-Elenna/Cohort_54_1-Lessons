package myTests.persons;

import lesson_28.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";


    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet(){

        String validEmail = "valid@test.com";

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());
        Assertions.assertNotEquals(startEmail, person.getEmail());
    }

    /*
    1. Берем не валидный email
    2. Устанавливаем его сеттером person
    3. Ожидаемый результат: invalidEmail установлен не будет
    4.
     */
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail){
       person.setEmail(invalidEmail);
       assertNotEquals(invalidEmail, person.getEmail());
       assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData(){
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-t@mail.net",
                ".est@mail.net",
                "test+1@mail.net"
        );
    }

}
