package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testCreate() {
        Movie movie=new Movie("Jurassic Park",1993,"Steven Spielberg");
        assertEquals("Jurassic Park",movie.getTitle());
    }
}

