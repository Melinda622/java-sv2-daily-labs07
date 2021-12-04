package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void HumanTest(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                () -> new Human("John",1800));
        assertEquals("You cannot be older than 120 years old!", exception.getMessage());
    }

    @Test
    void HumanTest2(){
        Human human=new Human("John",1974);
        assertEquals("John", human.getName());
        assertEquals(1974, human.getYearOfBirth());
    }
}