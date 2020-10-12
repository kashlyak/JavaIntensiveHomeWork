package by.jrr.kashlyak.products;

import by.jrr.kashlyak.products.bean.Product;
import by.jrr.kashlyak.products.bean.TypeProducts;

import by.jrr.kashlyak.products.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        List<Product> products = new ArrayList<>();
        productService.createProduct(products,"Moloko", 10.0,0.2, TypeProducts.DRINK);
        productService.createProduct(products,"Seler", 10.0,0.2, TypeProducts.DRINK);
        productService.createProduct(products,"Klever", 10.0,0.2, TypeProducts.DRINK);
        productService.createProduct(products,"Beler", 10.0,0.2, TypeProducts.DRINK);
        System.out.println(products);



    }
}
