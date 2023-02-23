import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class VendingMachine {
    protected List<Product> localList = new ArrayList<Product>();

//    public List<Product> getLocalList() {
//        return localList;
//    }
    private double cash;
    private double cashAmont;
    public VendingMachine addProduct(Product inputProduct) {
        localList.add(inputProduct);
        inputProduct.setLoadDate(Date.valueOf(LocalDate.now()));
        return this;
    }

    public List<Product> findProduct(String name) {
        List<Product> foundProduct = new ArrayList<>();
        for (Product product : localList) {
            if (product.getName().contains(name)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }
    public Product sellProduct(Product sallingProduct) {
        Product sellProduct = new Product();
        if (localList.contains(sallingProduct)) {
            for (int i = 0; i < localList.size(); i++) {
                if (localList.get(i) == sallingProduct) {
                    sellProduct = localList.get(i);
                    localList.remove(i);
                    cash += sellProduct.getCost();
                    return sellProduct;
                }
            }
        }
        return sellProduct;
    }

//    public List<Product> overdueProduct(Date nowDate){
//        List<Product> overdueProduct = new ArrayList<>();
//        for (Perishable product : localList){
//            if(nowDate.after((Product) Perishable.expireDate)){
//                overdueProduct.add(product);
//            }
//        }
//        return overdueProduct;
//    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Product product : localList) {
            localString.append(product.toString());
            localString.append("\n");
            cashAmont += product.getCost();
        }
        localString.append("Загружено продуктов на сумму " + cashAmont + "\n");
        cashAmont = 0;
        localString.append("Продано продуктов на сумму " + cash + "\n");
        return localString.toString();
    }
}
