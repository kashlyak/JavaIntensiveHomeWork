package by.jrr.kashlyak.bean;

import java.util.Objects;

public class Product {
    private String name;
    private Double bigDecimal;

    public Product() {
    }

    public Product(String name, Double bigDecimal) {
        this.name = name;
        this.bigDecimal = bigDecimal;
    }

    public String getName() {
        return name;
    }

    public Double getBigDecimal() {
        return bigDecimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(bigDecimal, product.bigDecimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bigDecimal);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", BigDecimal=" + bigDecimal +
                '}';
    }
}
