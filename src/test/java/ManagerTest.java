import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    String[] afisha = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4"};
    String poster = "Новый постер";

    @Test
    public void testAddPoster() {
        Manager manager = new Manager();
        manager.setAfisha(afisha);
        afisha = manager.addPoster(poster);

        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4", "Новый постер"};
        String[] actual = afisha;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll() {
        Manager manager = new Manager();
        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4"};
        String[] actual = manager.findAll(afisha);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast2Parametrs() {

        Manager manager = new Manager(3);
        manager.setAfisha(afisha);


        String[] expected = {"4", "3", "2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast1Param() {
        Manager manager = new Manager();
        manager.setAfisha(afisha);

        String[] expected = {"4", "3", "2", "1", "Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель 'Белград'", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast2ParamOverLenght() {
        Manager manager = new Manager(13);
        manager.setAfisha(afisha);

        String[] expected = {"4", "3", "2", "1", "Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель 'Белград'", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}