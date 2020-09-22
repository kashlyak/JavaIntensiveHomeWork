package by.jrr.kashlyak;

import by.jrr.kashlyak.bean.Product;
import by.jrr.kashlyak.service.Shop;

public class App {
    public static void main(String[] args) {
        Product productOne = new Product("Молоко", 2.11);
        Product productTwo = new Product("Хлеб", 0.76);
        Product productThree = new Product("Мыло", 3.75);
        Product productFour = new Product("Кока-Кола", 2.50);
        Product productFive = new Product("Макароны", 2.0);

        Shop myShop = new Shop();
        myShop.addProduct(productOne);
        myShop.addProduct(productTwo);
        myShop.addProduct(productThree);
        myShop.addProduct(productFour);
        myShop.addProduct(productFive);
        
        myShop.removeProduct(productFour);   
        
        
        myShop.findByName("Хлеб");
        myShop.findByPrice(1.0, 3.0);

    }
}
