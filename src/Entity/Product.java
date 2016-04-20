
package Entity;

import java.util.List;

/**
 *
 * @author Алекс1
 */
//класс Товар
public class Product {
    //Id товара = ключ
    private Integer productId;
    //название товара
    private String nameOfProduct;
    //цена товара
    private Integer priceOfProduct;
    //опісаніе товара
    private String describtionOfProduct;
    //лист товаров в заказе для внешнего ключа
    private List<ProductsInOrder> productsInOrders;
    
    
    
    //конструкторы

    public Product(Integer productId, String nameOfProduct, Integer priceOfProduct, String describtionOfProduct) {
        this.productId = productId;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.describtionOfProduct = describtionOfProduct;
    }

    public Product() {
    }
    
    
    //геттеры и сеттеры

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Integer getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(Integer priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getDescribtionOfProduct() {
        return describtionOfProduct;
    }

    public void setDescribtionOfProduct(String describtionOfProduct) {
        this.describtionOfProduct = describtionOfProduct;
    }
    
    
}
