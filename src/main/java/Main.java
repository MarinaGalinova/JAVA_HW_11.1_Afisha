import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String poster0 = "Бладшот";
//        String poster1 = "Вперед";
//        String poster2 = "Отель 'Белград'";
//        String poster3 = "Джентельмены";
//        String poster4 = "Человек - невидимка";
//        String poster5 = "Тролли. Мировой тур";
//        String poster6 = "Номер один";
//        String newName = "Добавленный фильм";

        String[] afisha = {"Бладшот", "Вперед", "Отель 'Белград'", "Джентельмены", "Человек - невидимка", "Тролли. Мировой тур", "Номер один",
                "Добавленный фильм1", "добавленный фильм2", "Добавленный фильм3", "Добавленный фильм4"};

//        afisha[0] = poster0;
//        afisha[1] = poster1;
//        afisha[2] = poster2;
//        afisha[3] = poster3;
//        afisha[4] = poster4;
//        afisha[5] = poster5;
//        afisha[6] = poster6;

        String[] afisha2 = new String[1];
        Manager newAfisha = new Manager();
        for (int i = 0; i < afisha.length; i++) {
            afisha2 = newAfisha.AddPoster(afisha[i], afisha2);

        }
        System.out.println (Arrays.toString(newAfisha.findAll(afisha2)));

        System.out.println (Arrays.toString(newAfisha.findLast(afisha2)));

    }
}
