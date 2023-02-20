import java.sql.SQLOutput;
import java.util.Arrays;

public class Manager {

    protected int limit; //лимит вывода последних добавленных фильмов
    protected String[] afisha;
    protected String poster;

    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {

        this.limit = limit;
    }

    public String[] getAfisha() {
        return afisha;
    }
    public void setAfisha(String[] afisha) {

        this.afisha = afisha;
    }

    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {

        this.poster = poster;
    }
    public Manager(String[] afisha) {
        setLimit(10);
        this.afisha = afisha;
    }

    public Manager(int limit, String[] afisha) {
        setLimit(limit);
        this.afisha = afisha;
    }

    public String[] addPoster(String poster, String[] afisha) {
        int x;
        if (afisha.length == 1 && afisha[0] == null) {
            x = 0;
        } else {
            x = 1;
        }

        String[] tmp = new String[afisha.length + x];
        for (int i = 0; i < afisha.length; i++) {
            tmp[i] = afisha[i];
        }
        tmp[tmp.length - 1] = poster;
        afisha = tmp;
        return afisha;

    }

    public String[] findAll(String[] afisha) {
        return afisha;
    }

    public String[] findLast() {

        int afishaLength;

        if (limit >= afisha.length) {
            afishaLength = afisha.length;
        } else {
            afishaLength = limit;
        }
        String[] result = new String[1];
        for (int i = afisha.length - 1; i > afisha.length - 1 - afishaLength; i--) {
            result = addPoster(afisha[i], result);

        }
        return result;
    }
}


//    public String[] findLast(String[] afisha) {
//        return findLast(10, afisha);
//
//    }


// заполняем result из массива, что лежит в поле
// в обратном порядке

//        private ProductRepository repo;
//
//    public ProductManager(ProductRepository repo) {
//            this.repo = repo;
//        }
//
//        public void add(PurchaseItem item) {
//            repo.save(item);
//        }
//
//        public PurchaseItem[] getItems() {
//            PurchaseItem[] all = repo.getItems();
//            PurchaseItem[] reversed = new PurchaseItem[all.length];
//            for (int i = 0; i < reversed.length; i++) {
//                reversed[i] = all[all.length - 1 - i];
//            }
//            return reversed;
//        }
//
//        public int getTotal() {
//            int sum = 0;
//            for (PurchaseItem item : repo.getItems()) {
//                sum = sum + item.getCount() * item.getProductPrice();
//            }
//            return sum;
//        }