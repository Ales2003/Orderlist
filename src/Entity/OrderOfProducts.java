
package Entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Алекс1
 */
//класс Заказ товаров
public class OrderOfProducts {
    //номер заказа =ключ
    private Integer orderOfProductsId;
    //дата поступления заказа
    private Date receiptDate;
    //лист товаров в заказе
    private List<ProductsInOrder> productsInOrders;

    //конструкторы
    public OrderOfProducts(Integer orderOfProductsId, Date receiptDate, List<ProductsInOrder> productsInOrders) {
        this.orderOfProductsId = orderOfProductsId;
        this.receiptDate = receiptDate;
        this.productsInOrders = productsInOrders;
    }

    public OrderOfProducts() {
    }
    
    
    //геттеры и сеттеры

    public Integer getOrderOfProductsId() {
        return orderOfProductsId;
    }

    public void setOrderOfProductsId(Integer orderOfProductsId) {
        this.orderOfProductsId = orderOfProductsId;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public List<ProductsInOrder> getProductsInOrders() {
        return productsInOrders;
    }

    public void setProductsInOrders(List<ProductsInOrder> productsInOrders) {
        this.productsInOrders = productsInOrders;
    }
    
    
    
}
