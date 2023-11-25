package ru.netology.Cinema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CinemaManagerTest {
    @Test
    public void noMovies() {
        CinemaManager manager = new CinemaManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void oneMovie() {
        CinemaManager manager = new CinemaManager();
        manager.addMovies("Bladshot");

        String[] expected = {"Bladshot"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void twoMovies() {
        CinemaManager manager = new CinemaManager();

        manager.addMovies("Onward");
        manager.addMovies("HotelBelgrad");

        String[] expected = {"Onward", "HotelBelgrad"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void lastMovies() {
        CinemaManager manager = new CinemaManager();

        manager.addMovies("TheGentlemen");
        manager.addMovies("TheInvisibleMan");
        manager.addMovies("TrollsWorldTour");

        String[] expected = {"TrollsWorldTour", "TheInvisibleMan", "TheGentlemen"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void noMoviesLast() {
        CinemaManager manager = new CinemaManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void lastMoviesOne() {
        CinemaManager manager = new CinemaManager();

        manager.addMovies("TheGentlemen");

        String[] expected = {"TheGentlemen"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void lastMoviesMore() {
        CinemaManager manager = new CinemaManager();

        manager.addMovies("TheGentlemen");
        manager.addMovies("TheInvisibleMan");
        manager.addMovies("TrollsWorldTour");

        String[] expected = {"TrollsWorldTour", "TheInvisibleMan", "TheGentlemen"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(actual, expected);
    }
}
