package ru.netology.Cinema;

public class CinemaManager {
    private String[] movies = new String[0];
    private final int limit;

    public CinemaManager() {
        this.limit = 3;

    }

    public CinemaManager(int limit) {
        this.limit = limit;

    }

    public void addMovies(String movie) {
        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];

        }
        return tmp;
    }
}
