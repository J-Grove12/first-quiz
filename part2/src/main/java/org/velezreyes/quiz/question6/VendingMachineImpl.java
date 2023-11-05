package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
    private int balance;
    private Map<String, Drink> inventory;
    

    public VendingMachineImpl() {

        this.balance = 0;
        this.inventory = new HashMap<>();
        
    }

    @Override
    public void insertQuarter() {
        balance += 25; 
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        Drink drink = inventory.get(name);

        if (drink == null) {
            throw new UnknownDrinkException();
        }

        if (balance < 25) {
            throw new NotEnoughMoneyException();
        }

        
        balance -= 25;
        return drink;
    }

 public void addDrink(String name, Drink drink, int priceInCents) {
    inventory.put(name, drink);
    // Establece el precio de la bebida en centavos
    drink.setPrice(priceInCents);
}


    public int getBalance() {
        return balance;
    }
    public static VendingMachine getInstance() {
        return new VendingMachineImpl();
    }

    private void addDrink(String scootCola, boolean b, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
 }   
