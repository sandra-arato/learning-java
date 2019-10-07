package com.idoescode;

import java.util.ArrayList;

public class GroceryList {
    private  int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void printList() {
        System.out.println("You have "+ groceryList.size() + " in your list:");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyItem(int position, String newItem) {
        groceryList.set(position, newItem);

        System.out.println("Your item has been modified");
    }

    public void removeItem(int position) {
        String theItem = groceryList.get(position);

        groceryList.remove(position);
    }

    public String findItem(String searchTerm) {
        // boolean hasItem = groceryList.contains(searchTerm);
        int position = groceryList.indexOf(searchTerm);

        if (position > -1) {
            return groceryList.get(position);
        }

        return null;
    }
}
