package com.company;

import java.util.ArrayList;

public class ItemAdd {

    String itemName;
    String itemPlace;
    int itemAmount;
    double itemPrice;
    int itemCode;

    ArrayList<Object> items;

    public ItemAdd(String itemName, String itemPlace, int itemAmount, double itemPrice, int itemCode) {
        this.itemName = itemName;
        this.itemPlace = itemPlace;
        this.itemAmount = itemAmount;
        this.itemPrice = itemPrice;
        this.itemCode = itemCode;
        items = new ArrayList<>();
        items.add(this.itemName);
        items.add(this.itemPlace);
        items.add(this.itemAmount);
        items.add(this.itemPrice);
        items.add(this.itemCode);
    }

    public void constructorList(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            Object element = list.get(i);
            if (element != null) {
                String numberedElement = (i + 1) + ". " + element.toString();
                System.out.println(numberedElement);
            } else {
                String numberedElement = (i + 1) + ". [Null]";
                System.out.println(numberedElement);
            }
        }
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPlace() {
        return itemPlace;
    }

    public void setItemPlace(String itemPlace) {
        this.itemPlace = itemPlace;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }
}
