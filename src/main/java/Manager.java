import java.sql.SQLOutput;
import java.util.Arrays;

public class Manager {
    public String[] AddPoster(String Poster, String[] afisha) {
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
        tmp[tmp.length - 1] = Poster;
        afisha = tmp;
        return afisha;

    }

    public String[] findAll(String[] afisha) {
        return afisha;
    }

    public String[] findLast(int limit, String[] afisha) {

        int afishaLength;

        if (limit >= afisha.length) {
            afishaLength = afisha.length;
        } else {
            afishaLength = limit;
        }
        String[] result = new String[1];
        for (int i = afisha.length-1; i > afisha.length-1-afishaLength; i--) {
            result=AddPoster(afisha[i], result);

        }
        return result;
    }



    public String[] findLast(String[] afisha) {
        return findLast(10, afisha);

    }

}
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