import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmTest {

    @Test
    public void addFilm() {
        ManagerFilm film = new ManagerFilm();

        film.add("film1");
        film.add("film2");
        film.add("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWhenLimitEqualNumberOfFilms() {
        ManagerFilm film = new ManagerFilm(3);


        film.add("film1");
        film.add("film2");
        film.add("film3");
        film.findAll();

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = film.findLast();
    }

    @Test
    public void findLastWhenLimitOverNumberOfFilms() {
        ManagerFilm film = new ManagerFilm(6);


        film.add("film1");
        film.add("film2");
        film.add("film3");
        film.findAll();

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = film.findLast();
    }

    @Test
    public void findLastWhenLimitLessNumberOfFilms() {
        ManagerFilm film = new ManagerFilm(2);


        film.add("film1");
        film.add("film2");
        film.add("film3");
        film.findAll();

        String[] expected = {"film2", "film1"};
        String[] actual = film.findLast();
    }

}