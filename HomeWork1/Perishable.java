import java.util.Date;
import java.util.List;

public class Perishable extends Product {
    private Date expireDate = new Date();
    private Date nowDate = new Date();


    public Perishable(String name, double cost, Date expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }

    public Date getExpireDate(){ return expireDate;}
//    public Product overdueProduct(List<Product> localList){
//        Product overdueProduct = new Product();
//        for (int i = 0; i< localList.size(); i++){
//            if(nowDate.after(expireDate){
//                overdueProduct = localList.get(i);
//                return overdueProduct;
//            }
//        }
//        return overdueProduct;
//    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" годен до %tF", expireDate));
        return localString.toString();
    }
}
