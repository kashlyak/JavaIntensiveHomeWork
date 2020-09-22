package by.jrr.kashlyak.service;

import by.jrr.kashlyak.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Product> myShop;

    public Shop() {
        this.myShop = new ArrayList<>();
    }
   public Shop(List<Product> myNewShop) {
        this.myShop = myNewShop;
   }

    public void addProduct(Product product) {
        myShop.add(product);
    }

    public void removeProduct(Product product) {
        myShop.remove(product);
    }

    public Product findByName(String name) {
        for(Product product : myShop) {
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    public List<Product> findByPrice (double minPrice, double maxPrice) {
        List<Product> wasteProducts = new ArrayList<>();
        for(Product product : myShop) {
            if(product.getBigDecimal()>minPrice&& product.getBigDecimal()<maxPrice) {
                wasteProducts.add(product);
            }
        }
        return wasteProducts;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "myShop=" + myShop +
                '}';
    }
}
