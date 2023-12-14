import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void addMovieTest() {
        PosterManager manager = new PosterManager(0);

        String[] expected = {};
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
        PosterManager manager = new PosterManager(7);

        manager.addMovie("Фильм 7");
        manager.addMovie("Фильм 6");
        manager.addMovie("Фильм 5");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 1");
        String[] expected = {"Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}

