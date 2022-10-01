public class SUV extends Car {

    private int monthlyRentCar;

    public int getMonthlyRentCar() {
        return monthlyRentCar;
    }

    public void setMonthlyRentCar(int monthlyRentCar) {
        this.monthlyRentCar = monthlyRentCar;
    }

    public int suvMonthlyFee() {
        int age = 12,day=30;
        int paySuv= (age*300/1000+ day*300);
         return paySuv;

    }
    public void suvDailyFee(){
        System.out.println("Günlük kiralama yaptınız.");
    }


}
