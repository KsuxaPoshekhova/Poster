import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void addMovieTest1() {
        PosterManager manager = new PosterManager(0);

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addMovieTest2() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Фильм 1");
        String[] expected = {"Фильм 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastTest3() {
        PosterManager manager = new PosterManager(3);

        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 1");
        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastTest4() {
        PosterManager manager = new PosterManager(5);

        manager.addMovie("Фильм 5");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 1");
        String[] expected = {"Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastTest5() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Фильм 10");
        manager.addMovie("Фильм 11");
        String[] expected = {"Фильм 11", "Фильм 10"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastTest6() {
        PosterManager manager = new PosterManager(7);

        manager.addMovie("Фильм 55");
        manager.addMovie("Фильм 56");
        manager.addMovie("Фильм 57");
        manager.addMovie("Фильм 58");
        manager.addMovie("Фильм 59");
        manager.addMovie("Фильм 60");
        manager.addMovie("Фильм 61");
        String[] expected = {"Фильм 61", "Фильм 60", "Фильм 59", "Фильм 58", "Фильм 57", "Фильм 56", "Фильм 55"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

