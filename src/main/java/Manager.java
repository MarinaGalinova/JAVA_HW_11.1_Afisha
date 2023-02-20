import java.sql.SQLOutput;
import java.util.Arrays;

public class Manager {

    protected int limit; //лимит вывода последних добавленных фильмов
    protected String[] afisha;
    //protected String poster;

    public Manager() {
        setLimit(10);

    }
    public Manager(int limit) {
        setLimit(limit);

    }
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

//    public String getPoster() {
//        return poster;
//    }
//    public void setPoster(String poster) {
//
//        this.poster = poster;
//    }


    public String[] addPoster(String poster) {
        int firstPosition;
        afisha = getAfisha();
        if (afisha.length == 1 && afisha[0] == null) {
            firstPosition = 0;
        } else {
            firstPosition = 1;
        }

        String[] tmp = new String[afisha.length + firstPosition];
        for (int i = 0; i < afisha.length; i++) {
            tmp[i] = afisha[i];
        }
        tmp[tmp.length - 1] = poster;
        afisha = tmp;
        return afisha;

    }

    public String[] findAll(String[] afisha)
    {
        return afisha;
    }

    public String[] findLast() {

        int afishaLength;
        afisha = getAfisha();
        limit = getLimit();
        int j;


        if (limit >= afisha.length) {
            afishaLength = afisha.length;
        } else {
            afishaLength = limit;
        }

        String[] result = new String[afishaLength];
        j = 0;
        for (int i = afisha.length - 1; i > afisha.length - 1 - afishaLength; i--) {
            //result = addPoster(afisha[i], result);

        result[j] = afisha[i];
        j = j +1;
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