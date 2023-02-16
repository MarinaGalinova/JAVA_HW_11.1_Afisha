import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    //Manager poster1 = new Manager(String[]afisha);
    String[] afisha = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4"};
    String poster = "Новый постер";
    Manager afisha2 = new Manager();

    @Test
    public void testAddPoster() {

        afisha = afisha2.AddPoster(poster, afisha);

        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4", "Новый постер"};
        String[] actual = afisha;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll() {

        String[] expected = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один", "1", "2", "3", "4"};
        String[] actual = afisha2.findAll(afisha);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast2Parametrs() {

        String[] expected = {"4", "3", "2"};
        String[] actual = afisha2.findLast(3, afisha);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast1Param() {

        String[] expected = {"4", "3", "2", "1", "Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель 'Белград'", "Вперед"};
        String[] actual = afisha2.findLast(afisha);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast1ParamOverLenght() {

        String[] expected = {"4", "3", "2", "1", "Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель 'Белград'", "Вперед", "Бладшот"};
        String[] actual = afisha2.findLast(12, afisha);

        Assertions.assertArrayEquals(expected, actual);
    }
}