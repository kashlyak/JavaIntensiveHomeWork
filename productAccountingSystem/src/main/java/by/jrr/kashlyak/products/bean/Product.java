package by.jrr.kashlyak.products.bean;



import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    String name;
    Long id;
    BigDecimal price;
    BigDecimal discount;
    TypeProducts typeProducts;
    BigDecimal actualPrice;
    

    public Product() {
    }

    public Product(String name, Double price, Double discount, TypeProducts typeProducts,long id) {
        this.name = name;        
        this.price = BigDecimal.valueOf(price);
        this.discount = BigDecimal.valueOf(discount);
        this.typeProducts = typeProducts;
        this.id = id;
        this.actualPrice = BigDecimal.valueOf(price - price*discount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = BigDecimal.valueOf(price);
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        BigDecimal.valueOf(discount);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(id, product.id) &&
                Objects.equals(price, product.price) &&
                Objects.equals(discount, product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, price, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", discount=" + discount +
                ", typeProducts=" + typeProducts +
                ", actualPrice=" + actualPrice +
                '}';
    }
}
