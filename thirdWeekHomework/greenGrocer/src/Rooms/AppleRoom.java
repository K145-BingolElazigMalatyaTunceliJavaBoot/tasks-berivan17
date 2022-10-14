package Rooms;

import Fruit.apple;

public class AppleRoom implements AppleManager{

    public double stockRoom=0;

    @Override
    public void addFruit(apple a, int amount) {
        a.setkg(amount);
        stockRoom=amount;
        System.out.println("StockRoom:   "+ stockRoom);

    }

    @Override
    public void buyFruit(apple a, int amount) {
        if(a.getKg()>amount)
        {
            System.out.println("Not enough apples in stock!!");
        }
        else{
            stockRoom=amount-a.getKg();
            System.out.println("After sale stock: "+ stockRoom);
        }

    }
}
