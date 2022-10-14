import Fruit.apple;
import Fruit.cherry;
import Fruit.pear;
import Rooms.AppleRoom;
import Rooms.CherryRoom;
import Rooms.PearRoom;

public class Main {
    public static void main(String[] args) {
        cherry c=new cherry();
        apple a=new apple();
        pear p=new pear();
        AppleRoom appleRoom=new AppleRoom();
        PearRoom pearRoom=new PearRoom();
        CherryRoom cherryRoom=new CherryRoom();



        appleRoom.addFruit(a,6);
        appleRoom.buyFruit(a,5);
        cherryRoom.addFruit(c,4);
        cherryRoom.buyFruit(c,5);
        pearRoom.addFruit(p,3);
        pearRoom.buyFruit(p,4);







}

}
