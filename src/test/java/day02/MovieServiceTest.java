package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void addMovies() {
        MovieService movieservice = new MovieService();
        Path path = Paths.get("src/main/resources/movies.csv");
        movieservice.addMovies(path);
        assertEquals(5, movieservice.getMovies().size());
        assertEquals("Jurassic park", movieservice.getMovies().get(0).getTitle());
    }

    @Test
    void TestException() {
        assertThrows(IllegalStateException.class, () -> new MovieService().addMovies(Paths.get("src/main/resources/movies.cs")));
    }
}