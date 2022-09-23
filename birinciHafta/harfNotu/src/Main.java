import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int puan = random.nextInt(100);
        if(puan>=0 && puan<35)
            System.out.println("Alınan harf notu: " + "FF");
        else if(puan>=35 && puan<50)
            System.out.println("Alınan harf notu: " + "DC");
        else if(puan>=50 && puan<70)
            System.out.println("Alınan harf notu: " + "BB");
        else if(puan>=70 && puan<100)
            System.out.println("Alınan harf notu: " + "AA");



    }

}