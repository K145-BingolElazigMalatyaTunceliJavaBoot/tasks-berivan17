public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0;
        for(sayi=200;sayi<500;sayi++)
        {
            if(sayi % 3 ==0)
            {
                continue;
            }
            else{
                toplam=toplam+sayi;

            }
        }
        System.out.println("Sayilarin Toplamı : " + toplam);

    }
}