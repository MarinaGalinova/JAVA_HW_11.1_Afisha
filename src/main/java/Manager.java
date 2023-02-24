import java.sql.SQLOutput;
import java.util.Arrays;

public class Manager {

    protected int limit; //лимит вывода последних добавленных фильмов
    private String[] afisha = new String[0];


    public Manager() {
        this.limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }


    public void addPoster(String poster) {

        String[] tmp = new String[afisha.length + 1];
        for (int i = 0; i < tmp.length - 1; i++) {
            tmp[i] = afisha[i];
        }
        tmp[tmp.length - 1] = poster;
        afisha = tmp;
    }

    public String[] findAll() {
        return afisha;
    }


    public String[] findLast() {
        int tmpLength = limit;
        if (afisha.length < limit) {
            tmpLength = afisha.length;
        }
        String[] tmp = new String[tmpLength];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = afisha[afisha.length - 1 - i];
        }
        return tmp;


    }
}

