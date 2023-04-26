/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pandelitosecommercewebsite;

/**
 *
 * @author Paolo
 */
public class CartItem
{
    String productName;
    double productPrice;
    int productAmount;

    public CartItem(String productName, double productPrice, int productAmount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
    }
    
    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public double getTotalPrice() {
        return productPrice * productAmount;
    }
}
