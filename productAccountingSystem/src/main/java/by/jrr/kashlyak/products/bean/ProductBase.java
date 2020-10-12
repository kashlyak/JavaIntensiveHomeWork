package by.jrr.kashlyak.products.bean;
import java.util.ArrayList;
import java.util.List;

public class ProductBase {
    public List<Product> productList;

    public static List<Product> createProductList() {
         List<Product> productList = new ArrayList<>();
        return  productList;
    }


}
