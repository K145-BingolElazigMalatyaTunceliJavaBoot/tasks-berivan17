package Rooms;
import Fruit.pear;

public class PearRoom implements PearManager{

    public double stockRoom=0;
    @Override
    public void addFruit(pear p, int amount) {
        p.setkg(amount);
        stockRoom=amount;
        System.out.println("StockRoom:   "+ stockRoom);

    }

    @Override
    public void buyFruit(pear p, int amount) {
        if(p.getKg()>amount)
        {
            System.out.println("Not enough pears in stock!!");
        }
        else{
            stockRoom=amount-p.getKg();
            System.out.println("After sale stock: "+ stockRoom);
        }

    }
}
