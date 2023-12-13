import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class posterManagerTest {
    @Test
    public void addMovieTest() {
        posterManager manager = new posterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovieTest2() {
        posterManager manager = new posterManager();

        manager.addMovie("Фильм 1");
        String[] expected = {"Фильм 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovieTest3() {
        posterManager manager = new posterManager();

        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        posterManager manager = new posterManager(3);

        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 1");
        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest2() {
        posterManager manager = new posterManager(0);

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest3() {
        posterManager manager = new posterManager(1);

        manager.addMovie("Фильм 1");
        String[] expected = {"Фильм 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest4() {
        posterManager manager = new posterManager(5);

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
        posterManager manager = new posterManager();

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

    @Test
    public void findLastTest6() {
        posterManager manager = new posterManager();

        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest7() {
        posterManager manager = new posterManager();

        manager.addMovie("Фильм 10");
        manager.addMovie("Фильм 11");
        String[] expected = {"Фильм 11", "Фильм 10"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest8() {
        posterManager manager = new posterManager(3);

        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest9() {
        posterManager manager = new posterManager(0);

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest10() {
        posterManager manager = new posterManager(7);

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

    @Test
    public void findLastTest11() {
        posterManager manager = new posterManager(1);

        manager.addMovie("Фильм 4");
        String[] expected = {"Фильм 4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

