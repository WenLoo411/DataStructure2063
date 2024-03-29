/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import ADT.ArraySet;
/**
 *
 * @author Wen
 */
public class Item {
    private String itemId;
    private String itemName;
    private double price;
    private Ingredient Ingredients;
    private char category;
    private ArraySet<IngredientsAdd> IngredientList;
    
    public Item(String itemId, String itemName, double price, char category){
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.Ingredients = Ingredients;
        this.IngredientList = new ArraySet<IngredientsAdd>();
        //this.IngredientList = new Ingredient();
        this.category = category;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Item getIngredients() {
        return this;
    }

    public ArraySet<IngredientsAdd> getIngredientList() {
        return IngredientList;
    }

    public void setIngredientList(ArraySet<IngredientsAdd> IngredientList) {
        this.IngredientList = IngredientList;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ItemId: " + itemId + "\nItemName: " + itemName + "\nPrice: " + price + IngredientList + "\nCategory: " + category + "\n";
    }
    
    
    
}



