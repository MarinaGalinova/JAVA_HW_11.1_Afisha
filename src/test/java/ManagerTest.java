import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    //Manager poster1 = new Manager(String[]afisha);
    String[] afisha = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4"};
    String poster = "Новый постер";
    //Manager manager = new Manager(afisha);

    @Test
    public void testAddPoster() {
        Manager manager = new Manager(afisha);
        afisha = manager.addPoster(poster, afisha);

        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4", "Новый постер"};
        String[] actual = afisha;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll() {
        Manager manager = new Manager(afisha);
        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4"};
        String[] actual = manager.findAll(afisha);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast2Parametrs() {

        Manager manager = new Manager(3, afisha);
        String[] expected = {"4", "3", "2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast1Param() {
        Manager manager = new Manager(afisha);

        String[] expected = {"4", "3", "2", "1", "Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель 'Белград'", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast1ParamOverLenght() {
        Manager manager = new Manager(afisha);

        String[] expected = {"4", "3", "2", "1", "Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель 'Белград'", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}