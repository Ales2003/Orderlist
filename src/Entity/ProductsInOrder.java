
package Entity;

/**
 *
 * @author Алекс1
 */
//класс Товары в заказе
public class ProductsInOrder {
    //Id товаров в каказе = ключ
    private Integer productsInOrderId;
   //товар
    private Product product;
    //количество
    private Integer quantityOfProducts;
    
    
    
    //конструкторы

    public ProductsInOrder(Integer productsInOrderId, Product product, Integer quantityOfProducts) {
        this.productsInOrderId = productsInOrderId;
        this.product = product;
        this.quantityOfProducts = quantityOfProducts;
    }

    public ProductsInOrder() {
    }
    
    
    //геттеры и сеттеры

    public Integer getProductsInOrderId() {
        return productsInOrderId;
    }

    public void setProductsInOrderId(Integer productsInOrderId) {
        this.productsInOrderId = productsInOrderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(Integer quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }
    
    
}
