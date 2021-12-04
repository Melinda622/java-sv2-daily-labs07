package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies=new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    private List<String> readMovies(Path path) {
        List<String> films = new ArrayList<>();
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<Movie> addMovies(Path path) {
        for (int i = 0; i < readMovies(path).size(); i++) {
            String[] a = readMovies(path).get(i).split(";");
            movies.add(new Movie(a[0],Integer.parseInt(a[1]),a[2]));

        } return movies;
    }
}


