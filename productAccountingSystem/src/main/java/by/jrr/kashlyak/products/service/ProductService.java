package by.jrr.kashlyak.products.service;

import by.jrr.kashlyak.products.bean.Product;
import by.jrr.kashlyak.products.bean.TypeProducts;

import java.util.List;
import java.util.Scanner;

public class ProductService {



    public static List<Product>  createProduct (List<Product> products, String name, double price, double discount, TypeProducts typeProduct) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название продукта:");
        name = scan.nextLine();
        System.out.println("Введите Цену продукта:");
        price =scan.nextDouble();
        System.out.println("Введите скидку продукта :");
        discount= scan.nextDouble();
        System.out.println("Выберите тип продукта(FRUIT,VEGETABLES, DRINK,BERRIES):");
        String type = scan.nextLine();
//        TypeProducts typeProduct = TypeProducts.valueOf(type);

        long id;
        if(products.size()==0) {
            id= 1;
        } else {
            id = products.size()+1;
        }
        products.add(new Product(name,price,discount,typeProduct,id));

        return products;
    }

    public Product findById(List<Product> products,Long id) {
        for ( Product product : products) {
            if(product.getId().equals(id)) {
                return  product;
            }
        }
        return null;    
    }
    public List<Product> removeById(List<Product> products,Long id) {
        for(Product product: products) {
            if(product.getId().equals(id)) {
                products.remove(product);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ProductService{}";
    }
}
