package org.example;

public class MovieManager {
    private String[] titles = new String[0];
    private int numberOfMoviesLimit;

    public MovieManager() {
        this.numberOfMoviesLimit = 5;
    }

    public MovieManager(int numberOfMovies) {
        this.numberOfMoviesLimit = numberOfMoviesLimit;
    }

    public void add(String title) {
        String[] tmp = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            tmp[i] = titles[i];
        }
        tmp[tmp.length - 1] = title;
        titles = tmp;
    }
    public String[] findAll() {
        return titles;
    }

    public String[] findLast() {
        int resultLength;
        if (titles.length < numberOfMoviesLimit) {
            resultLength = titles.length;
        } else {
            resultLength = numberOfMoviesLimit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = titles[titles.length - 1 - i];
        }
        return result;
    }
 }
