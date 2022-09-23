public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0;
        for(sayi=3;sayi<=100;sayi++)
        {
            int cntrl=0;

            for(int i=2;i<sayi;i++)
            {
                if(sayi % i ==0)
                {
                    cntrl =1;
                    break;
                }
            }
            if(cntrl==0)
            {
                toplam = toplam+sayi;


            }

        }
        System.out.println("Sayıların Toplamı: " + toplam);
    }

}
