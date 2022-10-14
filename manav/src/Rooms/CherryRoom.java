package Rooms;

import Fruit.cherry;

public class CherryRoom implements CherryManager{
    public double stockRoom=0;

    @Override
    public void addFruit(cherry c, int amount) {
        c.setkg(amount);
        stockRoom=amount;
        System.out.println("StockRoom:   "+ stockRoom);

    }

    @Override
    public void buyFruit(cherry c, int amount) {
        if(c.getKg()>amount)
        {
            System.out.println("Not enough cherry in stock!!");
        }
        else{
            stockRoom=amount-c.getKg();
            System.out.println("After sale stock: "+ stockRoom);
        }

    }
}
