/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Wen
 */
public class ItemOrder {
   // private Item itemOrder;
    private int itemQty;
    private float subTotal;
    
    public ItemOrder(){
        
    }
    
    public ItemOrder(/*Item itemOrder,*/ int qty){
       // this.itemOrder = itemOrder;
        this.subTotal = 0;
        this.itemQty = itemQty;
    }
    public void addItemOrder(){
       // this.itemOrder = itemOrder;
        this.subTotal = 0;
        this.itemQty = itemQty;
    }
    
    public ItemOrder getItemOrder(){
        return this;
    }
}

// for loop to return each item.