public class posterManager {
    private int limit;

    public posterManager() {
        this.limit = 5;
    }

    public posterManager(int limit) {
        this.limit = limit;
    }

    private String[] movies = new String[0];

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int numberOfFilms;
        if (movies.length < limit ) {
            numberOfFilms = movies.length;
        } else {
            numberOfFilms = limit ;
        }
        String[] tmp = new String[numberOfFilms];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
