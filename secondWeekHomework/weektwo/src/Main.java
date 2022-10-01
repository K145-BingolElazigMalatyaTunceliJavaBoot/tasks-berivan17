public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        SUV suv = new SUV();
        hatchback Hatchback = new hatchback();

        sedan.sedansMonthlyFee();
        System.out.println(sedan.sedansMonthlyFee());

        suv.suvMonthlyFee();
        System.out.println(suv.suvMonthlyFee());

    }
}
