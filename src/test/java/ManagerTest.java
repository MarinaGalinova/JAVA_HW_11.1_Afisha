import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void test() {

        Manager manager = new Manager();
        manager.addPoster("Первый добавленный");
        manager.addPoster("Второй добавленный");
        manager.addPoster("Третий добавленный");

        String[] expected = {"Первый добавленный", "Второй добавленный", "Третий добавленный"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindAll() {

        Manager manager = new Manager();
        manager.addPoster("Первый добавленный");

        String[] expected = {"Первый добавленный"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastParametr() {

        Manager manager = new Manager(3);

        manager.addPoster("Первый добавленный");
        manager.addPoster("Второй добавленный");
        manager.addPoster("Третий добавленный");
        manager.addPoster("Четвертый добавленный");

        String[] expected = {"Четвертый добавленный", "Третий добавленный", "Второй добавленный"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWithoutParam() {
        Manager manager = new Manager();

        manager.addPoster("1");
        manager.addPoster("2");
        manager.addPoster("3");
        manager.addPoster("4");
        manager.addPoster("5");
        manager.addPoster("6");
        manager.addPoster("7");
        manager.addPoster("8");
        manager.addPoster("9");
        manager.addPoster("10");
        manager.addPoster("11");
        manager.addPoster("12");


        String[] expected = {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
